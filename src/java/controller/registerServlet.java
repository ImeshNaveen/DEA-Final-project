package controller;

import Model.User;
import java.sql.DriverManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.jms.ConnectionFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registerServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        // variables
        String username, email, address, phone_no, password, confirm_password;
        
        // requesting form variable values
        username = request.getParameter("username");
        email = request.getParameter("email");
        phone_no = request.getParameter("phone_no");
        address = request.getParameter("address");
        password = request.getParameter("pw");
        confirm_password = request.getParameter("cpw");
        
        //out.println(username+"<br>"+email+"<br>"+phone_no+"<br>"+address+"<br>"+password+"<br>"+confirm_password);
        
        if(password.equals(confirm_password)){
            
            User user = new User();
            user.setUsername(username);
            user.setEmail(email);
            user.setTelephone(phone_no);
            user.setAddress(address);
            user.setPassword(password);
            
            //jdbc varables
            Connection conn = null;
            PreparedStatement pstmt = null;
            boolean inserted;

            try{
                //establish database connection
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/panchikawaththa?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");

//                //prepare SQL statement
//                String sql = "Insert into user(username, email, password, mobile, image, address, city_id) values(?,?,?,?,?,?,?)";
//                pstmt = conn.prepareStatement(sql);
//                pstmt.setString(1, user.getUsername());
//                pstmt.setString(2, user.getEmail());
//                pstmt.setString(3, user.getPassword());
//                pstmt.setString(4, user.getTelephone());
//                pstmt.setString(5, user.getImage());
//                pstmt.setString(6, user.getAddress());
//                pstmt.setInt(7, user.getCityId());
                
                String sql = "Insert into user1(name, password) values(?,?)";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, user.getUsername());
                pstmt.setString(2, user.getPassword());
                

                // Execute the SQL statement
                int rowsAffected = pstmt.executeUpdate();

                inserted = rowsAffected > 0;  
            }
            catch(SQLException e){

                e.printStackTrace();
                inserted = false;   //return false when exceptions occurs
            }
            finally{
                try{
                    if(pstmt != null){
                        pstmt.close();
                    }
                    if( conn != null){
                        conn.close();
                    }
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            
            System.out.println("Done");
            
            
            if(inserted){
                response.sendRedirect("login.jsp?page=register&status=3");
            }
            else{
                response.sendRedirect("login.jsp?page=register&status=4");
            }
            
            
            
        }else{
            response.sendRedirect("login.jsp?page=register&status=2");
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
