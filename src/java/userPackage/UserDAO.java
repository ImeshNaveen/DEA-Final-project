
package userPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    
    //db connection
    private String url = "jdbc:mysql://localhost:3308/panchikawaththa";
    private String dbusername = "root";
    private String password = "";
   
    private static final String insertUser = "insert into user(username, email, password, mobile, image, address, city_id) values(?,?,?,?,?,?,?)";
//    private static final String selectUser = "Select * from user where id = ?";
//    private static final String selectUsers = "Select * from user";
    
    protected Connection getConnection(){
        
        Connection connection = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, dbusername, password);
            System.out.println("Connection started!");
        }  
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;   
    }
    
    public void insertUser(User user){
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insertUser);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getMobile());
            preparedStatement.setString(5, user.getImage());
            preparedStatement.setString(6,user.getAddress());
            preparedStatement.setInt(7, user.getCity_id());
            preparedStatement.executeUpdate();
            System.out.println(user.getUsername() + " inserted!");
            connection.close();
            System.out.println("Connection closed!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
