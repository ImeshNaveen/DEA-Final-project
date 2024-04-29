package userPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class userServlet extends HttpServlet {
    
    private UserDAO useDAO;
    
    private userServlet(){
        this.useDAO = new UserDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String url = request.getRequestURI();
        String[] pages = url.split("/");
        
        String page = "login";
        if(pages.length > 2){
            page = pages[3];
        }
        
        switch(page){
            case "login":
                out.println("page: login");
                break;
            case "register":
                registerUser(request, response);
                break;
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }
    
    public void registerUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String password = request.getParameter("pw");
        String confirm_password = request.getParameter("cpw");
        
        if(password.equals(confirm_password)){
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String phone_no = request.getParameter("phone_no");
            String address = request.getParameter("address");
            String city_id = "5";
            String image = "user.lpg";
            
            try{
                System.out.println("Getting user Details");
                int cityId = Integer.parseInt(city_id);
                User newUser = new User(username,email,password,phone_no,image,address,cityId);
                useDAO.insertUser(newUser);
                response.sendRedirect("register");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        
    
    }

}
