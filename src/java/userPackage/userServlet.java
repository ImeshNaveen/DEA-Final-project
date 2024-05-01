
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
        
        out.println(action); 
        
        String value;
        if(url.length > 3){
            value = url[3];
        }else{
            value = "listUser";
        }
        
        switch(value){
            case "register":
                System.out.println("register");
                res.sendRedirect("../register.jsp");
                break;
            case "login":
                System.out.println("login");
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
            case "logUser":
                System.out.println("logUser");
                logUser(req, res);
                break;
            case "listUser":
                System.out.println("listUser");
                userList(req, res);
                break;
            case "update":
                out.println("updating");
                break;
            case "delete":
                out.println("Deleting");
                break;
            case "edit":
                out.println("editing");
                break;
            default:
                System.out.println("listUser");
                userList(req, res);
        }
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException{
        this.doGet(req, res);
    }
    
    public void dashboard(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException{
        
        
        
        HttpSession session = req.getSession(false); // Don't create a new session if it doesn't exist
        
        session.removeAttribute("user");
        
        if (session != null && session.getAttribute("user") != null) {
            // User is already logged in, redirect to profile page
            res.sendRedirect("../cms/admin-dashboard.jsp");
        } else {
            // User is not logged in, stay on the login page
            res.sendRedirect("../login.jsp?page=login&status=1");
        }
    }
    
    public void insertUser(HttpServletRequest req, HttpServletResponse res) 
            throws IOException, ServletException{
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
                res.sendRedirect("register.jsp");
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
        
        try{
            List<User> listusers = userDAO.selectUsers();
            
            RequestDispatcher dispatcher = req.getRequestDispatcher("/userList.jsp");
            req.setAttribute("listusers", listusers);
            dispatcher.forward(req, res);
            
        }catch(Exception e){
            e.printStackTrace(); 
        }
    }
    
    
}
