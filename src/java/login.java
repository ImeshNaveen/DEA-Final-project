import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class login extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false); // Don't create a new session if it doesn't exist
        
        session.removeAttribute("user");
        
        if (session != null && session.getAttribute("user") != null) {
            // User is already logged in, redirect to profile page
            response.sendRedirect("cms/admin-dashboard.jsp");
        } else {
            // User is not logged in, stay on the login page
            response.sendRedirect("login.jsp?page=login&error=1");
        }
    }
}
