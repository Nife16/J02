package weekTwo.SallysLemonadeStand;

import java.util.ArrayList;

public class Account {

    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private ArrayList<Product> boughtProducts;
    private CreditCard creditCard;

    // Address is saved for later  
    
    public Account() {
    }
    
    public Account(String name, String email, String password, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber
                + ", boughtProducts=" + boughtProducts + ", creditCard=" + creditCard + "]";
    }

    public ArrayList<Product> getBoughtProducts() {
        return boughtProducts;
    }

    public void setBoughtProducts(ArrayList<Product> boughtProducts) {
        this.boughtProducts = boughtProducts;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    
    
}
