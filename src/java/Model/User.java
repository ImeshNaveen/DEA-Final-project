package Model;

public class User {
    private String username;
    private String email;
    private String telephone;
    private String address;
    private String password;

    public User() {
        // Default constructor
    }
    
    public User(String username, String email, String telephone, String address, String password){
        this.username = username;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.password = password;
        
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
}
