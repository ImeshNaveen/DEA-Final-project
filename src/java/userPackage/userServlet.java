
package userPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class userServlet extends HttpServlet {
    
    
    private UserDAO userDAO;

    public userServlet() {
        this.userDAO = new UserDAO();
    }
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException{
        
        PrintWriter out = res.getWriter();
        
        String action = req.getRequestURI();
        String[] url = action.split("/");
         
        
        String value;
        if(url.length > 3){
            value = url[3];
        }else{
            value = "listUser";
        }
        
        System.out.println(action);
        
        switch(value){
            case "register":
                System.out.println("show register form");
                res.sendRedirect("../register.jsp");
                break;
            case "login":
                System.out.println("show login form");
                res.sendRedirect("../login.jsp");
                break;
            case "dashboard":
                System.out.println("dashboard");
                dashboard(req, res);
                break;
            case "insertUser":
                System.out.println("insertUser");
                insertUser(req, res);
                break;
            case "loginUser":
                System.out.println("loginUser");
                loginUser(req, res);
                break;
            case "logUser":
                System.out.println("logUser");
                logUser(req, res);
                break;
            case "listUser":
                System.out.println("listUser");
                userList(req, res);
                break;
            case "logout":
                System.out.println("Logout user");
                logoutUser(req, res);
                break;
            case "update":
                out.println("updating");
                break;
            case "delete":
                out.println("Deleting");
                break;
            case "userProfile":
                out.println("userProfile");
                userProfile(req, res);
                break;
            default:
                System.out.println("Profile - showing Profile");
                userProfile(req, res);
                break;
        }
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException{
        this.doGet(req, res);
    }
    
    public void dashboard(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException{
        
        System.out.println("Dashboard showing function");
        
        HttpSession session = req.getSession(false); // Don't create a new session if it doesn't exist
        
        session.removeAttribute("user");
        
        if (session != null && session.getAttribute("userId") != null) {
            // User is already logged in, redirect to profile page
            res.sendRedirect("../cms/index.jsp");
        } else {
            // User is not logged in, stay on the login page
            res.sendRedirect("../login.jsp?page=login&status=1");
        }
    }
    
    public void loginUser(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException{
        
        System.out.println("login user function");
        
        HttpSession session = req.getSession();
        
        try{
            String email = req.getParameter("email");
            String password = req.getParameter("password");

            User selectUser = userDAO.loginUser(email);
            String db_password = selectUser.getPassword();
            
            if(password.equals(db_password)){
                session.setAttribute("userId", selectUser.getId());
                session.setAttribute("username", selectUser.getUsername());
                System.out.println("New session started. session username is: "+ selectUser.getUsername());
                res.sendRedirect("../cms/index.jsp");
            }
        }catch(Exception e){
            e.printStackTrace();
        }   
    }
    
    public void logoutUser(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException{
        
        System.out.println("logout user Function");
        
        HttpSession session = req.getSession(false); // Obtain the session without creating a new one if it doesn't exist
        if (session != null) {
            session.invalidate(); // Invalidates the session and removes all session attributes
            // Optionally, redirect to a login page or another page after logout
            res.sendRedirect("../login.jsp?status=5"); // Redirect to login page after logout
        }
        
    }
    
    public void userProfile(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException{
        
        System.out.println("user profile function");
        
        HttpSession session = req.getSession();
        int userId = (int) session.getAttribute("userId");
        
        User selectUser = userDAO.selectUser(userId);
        
        req.setAttribute("selectedUser", selectUser);
        
        System.out.println(selectUser.getUsername());
        
    }
    
    public void insertUser(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException{
        
        System.out.println("insert user Function");
        
        String password = req.getParameter("pw");
        String confirm_password = req.getParameter("cpw");
        
        if(password.equals(confirm_password)){
            String username = req.getParameter("username");
            String email = req.getParameter("email");
            String phone_no = req.getParameter("phone_no");
            String address = req.getParameter("address");
            String city_id = "5";
            String image = "user.lpg";
            
            try{
                System.out.println("Getting user Details");
                int cityId = Integer.parseInt(city_id);
                User newUser = new User(username,email,password,phone_no,image,address,cityId);
                userDAO.insertUser(newUser);
                res.sendRedirect("../register.jsp?status=3");
            }catch(Exception e){
                e.printStackTrace();
            }
        }    
    }
    
    public void logUser(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException{
        this.doGet(req, res);
    }
    
    private void userList(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException{
        
        System.out.println("user list Function");
        
        try{
            List<User> listusers = userDAO.selectUsers();
            
            //RequestDispatcher dispatcher = req.getRequestDispatcher("cmsuserList.jsp");
            req.setAttribute("listusers", listusers);
            //dispatcher.forward(req, res);
            
        }catch(Exception e){
            e.printStackTrace(); 
        }
    } 
}
