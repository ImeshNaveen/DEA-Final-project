/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addcms;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class additemservlet extends HttpServlet {

    private additemDAO addItemDAO;

    public additemservlet() {
        this.addItemDAO = new additemDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        String action = req.getRequestURI();
        String[] uriParts = action.split("/");
        String turi = uriParts.length > 3 ? uriParts[3] : "sdk";

        switch (turi) {
            case "new":
                System.out.println("new case");
                showNewForm(req, res);
                break;
            case "insert":
                System.out.println("insert case");
                try {
                    insertItem(req, res);
                    req.setAttribute("message", "Data Added complete");
                } catch (SQLException ex) {
                    Logger.getLogger(additemservlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                System.out.println("default case");
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        this.doGet(req, res);
    }

    private void showNewForm(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        System.out.println("Showing new form");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/add-item.jsp");
        if (dispatcher != null) {
            dispatcher.forward(req, res);
        } else {
            System.out.println("Dispatcher is null");
        }
    }

    private void insertItem(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException, SQLException {
        try {
            String name = req.getParameter("name");
            int brandId = Integer.parseInt(req.getParameter("brand"));
            String model = req.getParameter("model");
            String condition = req.getParameter("condition");
            String description = req.getParameter("ides");
            int year = Integer.parseInt(req.getParameter("year"));
            double price = Double.parseDouble(req.getParameter("price"));
            Additem newItem = new Additem(name, brandId, model, condition, description, year, price);
            addItemDAO.insertItem(newItem);
            res.sendRedirect("url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
