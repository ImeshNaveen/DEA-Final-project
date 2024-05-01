/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categories;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pathum
 */
@WebServlet("/categoryServelet")
public class categoryServelet extends HttpServlet {
    
    private CatDAO catDAO;
    
    public categoryServelet()
    {
        this.catDAO = new CatDAO();
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
            List<Category> allCategories = catDAO.selectallcategory();
            RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
            req.setAttribute("allCategories", allCategories);
            dispatcher.forward(req,res);
        }catch(IOException | ServletException e){
            e.printStackTrace();
        }
    }
}
