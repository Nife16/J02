package weekTwo.SallysLemonadeStand;

public class Product {
    
    private String description; // describe our product
    private String name; // The name of the product
    private Double price; // price for product
    private Integer amount; // amount in stock

    public Product() {
    }
    
    public Product(String description, String name, Double price, Integer amount) {
        this.description = description;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product [description=" + description + ", name=" + name + ", price=" + price + ", amount=" + amount
                + "]";
    }

    public void removeOneProduct() {
        this.amount = this.amount - 1;
    }
    

}
