
 package productPackege;

public class Product {
    private int id;
    private String name;
    private int brand_id;
    private int category_id;
    private String modle;
    private String itemCondition;
    private String description;
    private String image;
    private String dateTime;
    private int year;
    private String price;

    public Product(int id,String name, int brand_id, int category_id, String modle, String itemCondition, String description, String image, String dateTime, int year, String price) {
        this.id = id;
        this.name=name;
        this.brand_id = brand_id;
        this.category_id = category_id;
        this.modle = modle;
        this.itemCondition = itemCondition;
        this.description = description;
        this.image = image;
        this.dateTime = dateTime;
        this.year = year;
        this.price = price;
    }

    public Product(String name, int brand_id, int category_id, String modle, String itemCondition, String description, String image, String dateTime, int year, String price) {
        this.name=name;
        this.brand_id = brand_id;
        this.category_id = category_id;
        this.modle = modle;
        this.itemCondition = itemCondition;
        this.description = description;
        this.image = image;
        this.dateTime = dateTime;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public String getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
    
    
        
    
    
}
