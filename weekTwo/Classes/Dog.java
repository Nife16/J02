package weekTwo.Classes;

public class Dog {
    
    private String breed;
    private String type;
    private Double weight;
    private String color;
    private String behavior;

    public Dog() {
    }

    public Dog(String breed, String type, Double weight, String color, String behavior) {
        this.breed = breed;
        this.type = type;
        this.weight = weight;
        this.color = color;
        this.behavior = behavior;
    }

    public void bark(String sound) {
        System.out.println(sound);
    }

    public static void sleep() {
        System.out.println("snore snore");
    }

    public static void eat() {
        System.out.println("chomp chomp");
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBehavior() {
        return behavior;
    }
    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    @Override
    public String toString() {
        return "Dog [breed=" + breed + ", type=" + type + ", weight=" + weight + ", color=" + color + ", behavior="
                + behavior + "]";
    }

    public void fryChicken() {
        System.out.println("poof its fried");   
    }

    public void fryChicken(int number) {
        System.out.println("air fryer that mug");
    }

    public void fryChicken(String number) {
        System.out.println("oven fried somehow");
    }
}
