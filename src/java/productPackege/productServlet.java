package productPackege;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import categories.CatDAO;
import categories.Category;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ECS COMPUTERS
 */
public class productServlet extends HttpServlet {
    
    private ProductDAO ProductDAO;
    
    public productServlet()
    {
        this.ProductDAO = new ProductDAO();
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
            url="showProducts";
        }
        
        switch(url){
            case "showProducts":
                showProducts(req, res);
                break;
                
            case "addItem":
                addItem(req, res);
                break;
                
            case "selectProduct":
                selectProduct(req, res);
                break;
            
            default:
                System.out.println("default!");
                showProducts(req, res);
                break;
        }
    }
    
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException{
        this.doGet(req, res);
    }
    
    private void addItem(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException{
        
        System.out.println("Add item Method");
        
        String name = req.getParameter("name");
        int category = 34;      //req.getParameter("category");
        int brand = 45;     //req.getParameter("brand");
        String model = req.getParameter("model");
        int year = 2024;      //req.getParameter("year");
        String condition = req.getParameter("condition");
        String item_description = req.getParameter("item_description");
        String image = "vehical.jpeg";
        String dateTime = "2024-05-05 23:12";
        String price = req.getParameter("price");
        
        //image moving section start
        
        //end
        
        Product productOBJ = new Product(name, brand, category, model, condition, item_description, image, dateTime, year, price);
        ProductDAO.insertProduct(productOBJ);
    }
    
    private void showProducts(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException{
        
        System.out.println("Show product Method");
        
        try{
            List<Product> allProducts = ProductDAO.selectProducts();
            
            RequestDispatcher dispatcher = req.getRequestDispatcher("shop.jsp");
            req.setAttribute("allProducts", allProducts);
            dispatcher.forward(req, res);
        }
        catch(IOException | ServletException e){
            e.printStackTrace();
        }
    }
    
    public void selectProduct(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException{
        
        System.out.println("Selecting Product Method");
        
        int productId = Integer.parseInt(req.getParameter("productId"));
        System.out.println(productId);
        
        Product product = ProductDAO.selectProduct(productId);
        req.setAttribute("product", product);
        System.out.println(product.getName());
        
        res.sendRedirect("../product-details.jsp");
    }
}
