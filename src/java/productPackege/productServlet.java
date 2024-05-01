
package productPackege; 


import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import productPackege.Product;
import productPackege.ProductDAO;

@WebServlet("/productServelet")
public class productServlet extends HttpServlet {
    
    private ProductDAO productDAO;
    
    public productServlet()
    {
        this.productDAO = new ProductDAO();
    }

    protected void doGet(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException
    {
        String action=req.getRequestURI();
        String[] urlpartns=action.split("/");
        String url="";
        
        if(urlpartns.length>3){
            url=urlpartns[3];
        }else
        {
            url="default";
        }
        System.out.println(url);
        
        switch(url){
            case "new":
                System.out.println("new route");
                break;   
            case "default":
                show_index(req,res);
                break;
            default:
                show_index(req,res);
                break;
        }
    }
    
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException
    {
        this.doGet(req, res);
    }
    
    private void show_index(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException
    {
        try{
            List <Product> allProduct = productDAO.selectProducts();
            RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
            req.setAttribute("allProduct",allProduct);
            dispatcher.forward(req, res);
        }catch(IOException | ServletException e){
            e.printStackTrace();
        }
    }
}
