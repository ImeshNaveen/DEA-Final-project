package wishlistPackage;

public class Wishlist {
    private int id;
    private int user_id;
    private int product_id;
    private String product_name;
    private String price; 

    public Wishlist(int id, int user_id, int product_id, String product_name, String price) {
        this.id = id;
        this.user_id = user_id;
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }

    
    public Wishlist(int id, int product_id, String product_name, String price) {
        this.id = id;
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
