package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User {
    private String username;
    private String email;
    private String telephone;
    private String image;
    private String address;
    private String password;
    private Integer city_id;

    public User() {
        // Default constructor
        username = null;
        email = null;
        telephone = null;
        address = null;
        password = null;
        city_id = null;
        image = null;
        
    }
    
    public User(String username, String email, String telephone, String address, String password, String image, Integer city_id){
        this.username = username;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.password = password;
        this.image = image;
        this.city_id = city_id;
        
    }

    // Getters and setters for all fields
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Integer getCityId(){
        return city_id;
    }
    
    public void setCityId(Integer city_id){
        this.city_id = city_id;
    }
    
    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image = image;
    }
}
