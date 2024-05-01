/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productPackege;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    //db connection
    private String url = "jdbc:mysql://localhost:3306/panchikawaththa";
    private String username="root";
    private String password="";
    
    private static final String insertProducts="insert into products(name,brand_id,category_id,modle,itemCondition,description,image,dateTime,year,price) values(?,?,?,?,?,?,?,?,?,?)";
    private static final String selectProducts="Select * from products where id= ?";
    private static final String selectAllProducts="Select * from products";

    protected Connection getConnection(){
        
        Connection connection = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection started!");
        }  
        catch(SQLException e){
            System.out.println("SQL!");
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            System.out.println("Classs not foun!");
            e.printStackTrace();
        }
        return connection;
    }
    
    public void insertProduct(Product products){
        try{
            Connection connection= getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(insertProducts);
            preparedStatement.setString(1,products.getName());
            preparedStatement.setInt(2,products.getBrand_id());
            preparedStatement.setInt(3,products.getCategory_id());
            preparedStatement.setString(4,products.getModle());
            preparedStatement.setString(5,products.getItemCondition());
            preparedStatement.setString(6,products.getDescription());
            preparedStatement.setString(7,products.getImage());
            preparedStatement.setString(8,products.getDateTime());
            preparedStatement.setInt(9,products.getYear());
            preparedStatement.setString(10,products.getPrice());
            preparedStatement.executeUpdate();
            System.out.println(products.getName()+"inserted!");
            connection.close();
            System.out.println("Connection closed");
             
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public Product selectProduct(int select_id){
        Product product=null;
        try{
           Connection connection= getConnection(); 
            PreparedStatement preparedStatement=connection.prepareStatement(selectProducts);
            preparedStatement.setInt(1,select_id);
            
            ResultSet productDetails = preparedStatement.executeQuery();
            
            while(productDetails.next()){
             int id = productDetails.getInt("id");
             String name = productDetails.getString("name");
             int brand_id = productDetails.getInt("brand_id");
             int category_id = productDetails.getInt("category_id");
             String modle = productDetails.getString("modle");
             String itemCondition = productDetails.getString("itemCondition");
             String description = productDetails.getString("discription");
             String image = productDetails.getString("image");
             String dateTime = productDetails.getString("dateTime");
             int year=productDetails.getInt("year");
             String price=productDetails.getString("price");
             product= new Product(id,name,brand_id,category_id,modle,itemCondition,description,image,dateTime,year,price);
             connection.close();
            System.out.println("Connection closed");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return product;
    }
    
    public List <Product> selectProducts(){
        List <Product> products=new ArrayList<>();
        Product product= null;
        try{
           Connection connection= getConnection(); 
            PreparedStatement preparedStatement=connection.prepareStatement(selectAllProducts);
            
            ResultSet productDetails = preparedStatement.executeQuery();
            
            while(productDetails.next()){
             int id = productDetails.getInt("id");
             String name = productDetails.getString("name");
             int brand_id = productDetails.getInt("brand_id");
             int category_id = productDetails.getInt("category_id");
             String modle = productDetails.getString("modle");
             String itemCondition = productDetails.getString("itemCondition");
             String description = productDetails.getString("discription");
             String image = productDetails.getString("image");
             String dateTime = productDetails.getString("dateTime");
             int year=productDetails.getInt("year");
             String price=productDetails.getString("price");
             product= new Product(id,name,brand_id,category_id,modle,itemCondition,description,image,dateTime,year,price);
             
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return products;
    }
    


}