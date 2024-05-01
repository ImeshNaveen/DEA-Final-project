package controller;

import Model.User;
import java.sql.DriverManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
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
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
