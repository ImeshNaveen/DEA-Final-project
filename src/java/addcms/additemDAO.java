/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addcms;

/**
 *
 * @author sandi
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class additemDAO {

    //db connection
    private String jdbcurl = "jdbc:mysql://localhost:3306/panchikawaththa";
    private String username="root";
    private String password="";

    private static final String INSERT_ITEM_SQL = "insert into products (name, brand_id, model, itemcondition, description,year, price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcurl, username, password);
            System.out.println("db connected");
        } catch (SQLException e) {
            System.err.println("Error: Could not connect to MySQL database: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error: MySQL JDBC driver not found: " + e.getMessage());
        }
        return connection;
    }

    public void insertItem(Additem additem) {
    try {
        Connection connection = getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ITEM_SQL);
            preparedStatement.setString(1, additem.getName());
            preparedStatement.setInt(2, additem.getBrandId());
            preparedStatement.setString(3, additem.getModel());
            preparedStatement.setString(5, additem.getCondition());
            preparedStatement.setString(6, additem.getDescription());
            preparedStatement.setInt(4, additem.getYear());
            preparedStatement.setDouble(8, additem.getPrice());
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) affected");
        } else {
            System.out.println("Connection is null");
        }
        connection.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
