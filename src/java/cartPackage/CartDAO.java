package cartPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import productPackege.Product;
import static productPackege.ProductDAO.getConnection;
import userPackage.UserDAO;

/**
 *
 * @author Kavindya
 */
public class CartDAO {
    
    
    //db connection
    private String database_url = "jdbc:mysql://localhost:3308/panchikawaththa";
    private String database_username = "root";
    private String database_password = "";
    
    
    private static final String insert = "INSERT INTO cart (user_id, product_id) VALUES (?, ?)";
    
    
    protected Connection getConnection(){
    
        Connection conn = null; //creating Connection variable named "conn"
        try{
            Class.forName("com.mysql.jdbc.Driver"); //loading jdbc driver
            conn = DriverManager.getConnection(database_url, database_username, database_password); //get connection for our selected database
            System.out.println("Database connected!"); 
        }
        catch(SQLException e){      //sql exceptions
            e.printStackTrace();    // if error is occured error will be insert printStackTrace
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return conn;    // retuning connection from getConnection() method
    }
    
public void insertProduct(Cart cart) {
        
        try{
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(insert);
            stmt.setInt(1, cart.getUser_id());
            stmt.setInt(2, cart.getProduct_id());
            stmt.executeUpdate();
            System.out.println("Inserted!");
            stmt.close();
            conn.close();
            System.out.println("Connection closed!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }

    
}
