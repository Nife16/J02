package weekTwo.AbstractLab;

public abstract class Person {
    
    abstract public double taxes(double amount);
    abstract public double calculateTelePhoneBill(double amount);
    abstract public String getFullName();
    abstract public void setFullName(String fullName);
    abstract public String toString();
}
