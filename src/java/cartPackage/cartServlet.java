package cartPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class cartServlet extends HttpServlet {
    
    private CartDAO cartDAO;

    public cartServlet() {
        this.cartDAO = new CartDAO();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        
        String action = req.getRequestURI();
        String[] url = action.split("/");
         
        
        String value;
        if(url.length > 3){
            value = url[3];
        }else{
            value = "showCart";
        }
        
        System.out.println(action);
        
        switch(value){
            case "showCart":
                System.out.println("Show cart case");
                break;
            case "insertCart":
                System.out.println("insert into cart option");
                insertCart(req, res);
                break;
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        this.doGet(req, res);
    }

    private void insertCart(HttpServletRequest req, HttpServletResponse res) 
        throws ServletException, IOException {
        
        System.out.println("Method boss");
        HttpSession session = req.getSession();
        
        String productId = req.getParameter("productId");
            Cart cart = new Cart(32,54);
            cartDAO.insertProduct(cart);
        
    }


}
