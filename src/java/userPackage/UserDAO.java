
package userPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    
    //db connection
    private String url = "jdbc:mysql://localhost:3308/Library";
    private String username = "root";
    private String password = "";
   
    private static final String insertUser = "insert into user(username, email, password, mobile, image, address, city_id) values(?,?,?,?,?,?,?)";
    private static final String selectUser = "Select * from user where id = ?";
    private static final String selectUsers = "Select * from user";
    
    protected Connection getConnection(){
        
        Connection connection = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
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
    
    public List<User> selectUsers(){
        List<User> users = new ArrayList<>();
        User user = null;
        
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(selectUsers);
            
            ResultSet userDetails = preparedStatement.executeQuery();
            while(userDetails.next()){
                int id = userDetails.getInt("id");
                String user_name = userDetails.getString("username");
                String email = userDetails.getString("email");
                String password = userDetails.getString("password");
                String mobile = userDetails.getString("mobile");
                String image = userDetails.getString("image");
                String address = userDetails.getString("address");
                int city_id = userDetails.getInt("city_id");
                users.add(new User(id,user_name,email,password,mobile,image,address,city_id)); 
            }
            connection.close();
            System.out.println("Connection closed!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return users;
    }
}