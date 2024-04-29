package userPackage;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private String mobile;
    private String image;
    private String address;
    private int city_id;

    public User(int id, String username, String email, String password, String mobile, String image, String address, int city_id) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.image = image;
        this.address = address;
        this.city_id = city_id;
    }

    public User(String username, String email, String password, String mobile, String image, String address, int city_id) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.image = image;
        this.address = address;
        this.city_id = city_id;
        System.out.println("user constructor");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    } 
}
