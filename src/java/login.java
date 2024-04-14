import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String buttonClicked = request.getParameter("buttonClicked");
        
        //login user
        if("login".equals(buttonClicked)){
            String email = request.getParameter("logemail");
            String password = request.getParameter("logpassword");
            
            out.println(email + "<br>" + password);
        }
        
        //register user
        if("register".equals(buttonClicked)){
            String username = request.getParameter("regUsername");
            String email = request.getParameter("regEmail");
            String PW = request.getParameter("regPW");
            String confirmPW = request.getParameter("regCPW");
            
            out.println(email + "<br>" + username + "<br>" + PW + "<br>" + confirmPW);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
