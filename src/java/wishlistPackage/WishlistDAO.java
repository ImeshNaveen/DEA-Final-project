
package wishlistPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WishlistDAO {
    
    //db connection
    private String database_url = "jdbc:mysql://localhost:3308/panchikawaththa";
    private String database_username = "root";
    private String database_password = "";
    
    private static final String insertWhishlist = "insert into wishlist(user_id, product_id) values(?,?)";
    
    protected Connection getConnection(){
    
        Connection conn = null; 
        try{
            Class.forName("com.mysql.jdbc.Driver"); //loading jdbc driver
            conn = DriverManager.getConnection(database_url, database_username, database_password); //get connection for our selected database
            System.out.println("Database connected!"); 
        }
        catch(SQLException e){      
            e.printStackTrace();   
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return conn;    
    }
    
    public void addToWishlist(int productId, int userId) {
        try{
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(insertWhishlist);
            stmt.setInt(1, userId);
            stmt.setInt(2, productId);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    

}
