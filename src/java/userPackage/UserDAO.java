
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
    private String database_url = "jdbc:mysql://localhost:3306/panchikawaththa";
    private String database_username = "root";
    private String database_password = "";
   
    private static final String insertUser = "insert into user(username, email, password, mobile, image, address, city_id) values(?,?,?,?,?,?,?)";
    private static final String selectUser = "Select * from user where id = ?";
    private static final String selectUserByEmail = "Select * from user where email = ?";
    private static final String selectUsers = "Select * from user";
    private static final String deleteUser = "delete from user where id = ?";
    
    // method for get database connection
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
    
    public void insertUser(User user){
        try{
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(insertUser);
            stmt.setString(1, user.getUsername());
            stmt.setString(2,user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getMobile());
            stmt.setString(5, user.getImage());
            stmt.setString(6,user.getAddress());
            stmt.setInt(7, user.getCity_id());
            stmt.executeUpdate();
            System.out.println(user.getUsername() + " inserted!");
            stmt.close();
            conn.close();
            System.out.println("Connection closed!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public User selectUser(int selectedId){
        User user = null;
        try{
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(selectUser);
            stmt.setInt(1, selectedId);
            ResultSet userDetails = stmt.executeQuery();
            while(userDetails.next()){
                int id = userDetails.getInt("id");
                String user_name = userDetails.getString("username");
                String email = userDetails.getString("email");
                String password = userDetails.getString("password");
                String mobile = userDetails.getString("mobile");
                String image = userDetails.getString("image");
                String address = userDetails.getString("address");
                int city_id = userDetails.getInt("city_id");
                user = new User(id,user_name,email,password,mobile,image,address,city_id); 
            }
            userDetails.close();
            stmt.close();
            conn.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
    
    public User loginUser(String userEmail){
        User user = null;
        try{
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(selectUserByEmail);
            stmt.setString(1, userEmail);
            ResultSet userDetails = stmt.executeQuery();
            while(userDetails.next()){
                int id = userDetails.getInt("id");
                String user_name = userDetails.getString("username");
                String email = userDetails.getString("email");
                String password = userDetails.getString("password");
                String mobile = userDetails.getString("mobile");
                String image = userDetails.getString("image");
                String address = userDetails.getString("address");
                int city_id = userDetails.getInt("city_id");
                user = new User(id,user_name,email,password,mobile,image,address,city_id); 
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
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
    
    public boolean deleteUser(int deleteId){
        boolean rowDeleted = false;
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(deleteUser);
            preparedStatement.setInt(1, deleteId);
            rowDeleted = preparedStatement.executeUpdate() > 0;     
        }catch(Exception e){
            e.printStackTrace();
        }
        return rowDeleted;
    }
}
