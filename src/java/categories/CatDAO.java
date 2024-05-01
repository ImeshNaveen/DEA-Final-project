/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categories;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pathum
 */
public class CatDAO {
  //db connection
    private String url = "jdbc:mysql://localhost:3306/panchikawaththa?useSSL=false;";
    private String username="root";
    private String password="";
    
    //private static final String insertCategories="insert into products(id,name,image) values(?,?,?)";
   // private static final String selectCategories="Select * from product_category where id= ?";
    private static final String selectAllCategories="Select * from product_category";

    protected Connection getConnection(){
        
        Connection connection = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(url,username,password);
            System.out.println("Connection started");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }
    public List<Category> selectallcategory(){
       List<Category> categories = new ArrayList<>();
       Category category = null;
       try{
           Connection connection = getConnection();
           PreparedStatement prepare=connection.prepareStatement(selectAllCategories);
           ResultSet rs=prepare.executeQuery();
           
           while(rs.next())
           {
               int id= rs.getInt("id");
               String name=rs.getString("name");
               String image=rs.getString("image");
               categories.add(new Category(name,image));
           }
       }catch(SQLException ex)
       {
           ex.printStackTrace();
       }
       return categories;
    }
    
    
   
}
