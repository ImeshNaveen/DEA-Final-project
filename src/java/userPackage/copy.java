package userPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class copy extends HttpServlet {
    
    private UserDAO useDAO;
    
    private copy(){
        this.useDAO = new UserDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String url = request.getRequestURI();
        String[] pages = url.split("/");
        
        String page;
        if(pages.length > 2){
            page = pages[3];
        }else{
            page = "login";
        }
        
        switch(page){
            case "login":
                System.out.println("login switch");
                login(request, response);
                break;
            case "register":
                register(request, response);
                break;
            case "dashboard":
                dashboard(request, response);
                break;
                
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }
    
    protected void dashboard(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        session.removeAttribute("user");
        
        if (session != null && session.getAttribute("user") != null) {
            response.sendRedirect("cms/index.jsp");
        } 
        else{
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp?page=login&status=1");
            dispatcher.forward(request, response);
        }
        
    }
    
    
    // directives
    protected void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("login method");
        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);
    }
    
    protected void register(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {    
        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);      
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
                response.sendRedirect("register.jsp");
            }catch(Exception e){
                e.printStackTrace();
            }
        }   
    }

    

}
