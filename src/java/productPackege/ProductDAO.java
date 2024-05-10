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
    private String url = "jdbc:mysql://localhost:3308/panchikawaththa";
    private String username="root";
    private String password="";
    
    private static final String insertProducts="insert into products(name,brand_id,category_id,model,itemCondition,description,image,dateTime,year,price) values(?,?,?,?,?,?,?,?,?,?)";
    private static final String selectProduct="Select * from products where id= ?";
    private static final String selectProducts="Select * from products";
    private static final String deleteProduct="delete from products where id=?";
    

    
    
    public void insertProduct(Product products){
        try{
            Connection conn = getConnection();
            PreparedStatement stmt= conn.prepareStatement(insertProducts);
            stmt.setString(1,products.getName());
            stmt.setInt(2,products.getBrand_id());
            stmt.setInt(3,products.getCategory_id());
            stmt.setString(4,products.getModle());
            stmt.setString(5,products.getItemCondition());
            stmt.setString(6,products.getDescription());
            stmt.setString(7,products.getImage());
            stmt.setString(8,products.getDateTime());
            stmt.setInt(9,products.getYear());
            stmt.setString(10,products.getPrice());
            stmt.executeUpdate();
            System.out.println(products.getName()+"inserted!");
            conn.close();
            System.out.println("Connection closed");
             
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3308/panchikawaththa";
        String username = "root";
        String password = "";
        System.out.println("Connection started!");
        return DriverManager.getConnection(url, username, password);
    }
    
    public static Product selectProduct(int id) {
        Product product = null;
        String selectProduct = "SELECT * FROM products WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(selectProduct)) {

            preparedStatement.setInt(1, id);
            ResultSet productDetails = preparedStatement.executeQuery();

            if (productDetails.next()) {
                int product_id = productDetails.getInt("id");
                String product_name = productDetails.getString("name");
                int brand_id = productDetails.getInt("brand_id");
                int category_id = productDetails.getInt("category_id");
                String model = productDetails.getString("model");
                String condition = productDetails.getString("itemCondition");
                String description = productDetails.getString("description");
                String image = productDetails.getString("image");
                String dateTime = productDetails.getString("dateTime");
                int year = productDetails.getInt("year");
                String price = productDetails.getString("price");
                product = new Product(product_id,product_name, brand_id, category_id, model, condition, description, image, dateTime, year, price);
            }

            System.out.println("Product selected successfully!");
        } catch (SQLException e) {
            e.printStackTrace(); // Handle or log the exception as needed
        }

        return product;
    }
    
    public static List<Product> selectProducts() {
        List<Product> products = new ArrayList<>();

        int count = 0;
        
        try (Connection conn = getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(selectProducts);
             ResultSet productDetails = preparedStatement.executeQuery()) {

            while (productDetails.next()) {
                count++;
                int product_id = productDetails.getInt("id");
                String product_name = productDetails.getString("name");
                int brand_id = productDetails.getInt("brand_id");
                int category_id = productDetails.getInt("category_id");
                String product_modle = productDetails.getString("model");
                String item_condition = productDetails.getString("itemCondition");
                String product_discription = productDetails.getString("description");
                String product_image = productDetails.getString("image");
                String date_time = productDetails.getString("dateTime");
                int product_year = productDetails.getInt("year");
                String product_price = productDetails.getString("price");

                Product product = new Product(product_id, product_name, brand_id, category_id, product_modle,
                        item_condition, product_discription, product_image, date_time, product_year, product_price);

                // Add the product to the list
                products.add(product);
            }
            System.out.println("Connection closed!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        for(Product product: products){
            System.out.println(product.getName());
        }
        
        return products;
    }
    
    public static List<Product> selectProducts(int categoryId) {
        List<Product> products = new ArrayList<>();

        try (Connection conn = getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM products WHERE category_id = ?");
        ) {
            preparedStatement.setInt(1, categoryId);
            try (ResultSet productDetails = preparedStatement.executeQuery()) {
                while (productDetails.next()) {
                    int product_id = productDetails.getInt("id");
                    String product_name = productDetails.getString("name");
                    int brand_id = productDetails.getInt("brand_id");
                    int category_id = productDetails.getInt("category_id");
                    String product_model = productDetails.getString("model");
                    String item_condition = productDetails.getString("itemCondition");
                    String product_description = productDetails.getString("description");
                    String product_image = productDetails.getString("image");
                    String date_time = productDetails.getString("dateTime");
                    int product_year = productDetails.getInt("year");
                    String product_price = productDetails.getString("price");

                    Product product = new Product(product_id, product_name, brand_id, category_id, product_model,
                            item_condition, product_description, product_image, date_time, product_year, product_price);

                    // Add the product to the list
                    products.add(product);
                }
            }
            System.out.println("Connection closed!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Product product : products) {
            System.out.println(product.getName());
        }

        return products;
    }

    
    public static boolean deleteProduct(int productId){
        boolean rowDeleted = false;
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(deleteProduct);
            preparedStatement.setInt(1, productId);
            rowDeleted = preparedStatement.executeUpdate() > 0; 
            System.out.println("Product deleted!");
        }catch(Exception e){
            e.printStackTrace();
        }
        return rowDeleted;
    }
    


}