package weekTwo.SallysLemonadeStand;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Account> listOfAccounts = new ArrayList<Account>();
    static Scanner scr = new Scanner(System.in);
    static Product strLemonade = new Product("Strawberry Sweet", "Strawberry Lemonade", 8.99, 20000);
    static Product bbrLemonade = new Product("Blueberry Sweet", "Blueberry Lemonade", 6.99, 20000);
    static Product bwmLemonade = new Product("Boneless Goodness", "Boneless Watermelon Lemonade", 12.99, 20000);
    static Product sallyWater = new Product("It'll make your hair grow", "Special Water", 10.99, 20000);

    public static void main(String[] args) {

        Account fakeAccount = new Account("Seymore Butts", "seymore@gmail.com",
            "123cantseeme", "1234567890");
        listOfAccounts.add(fakeAccount);

        // Collections.sort(personList, Comparator.comparing(Person::getLastName));

        int choice;
        do {
            Account account = null;
            System.out.println("Welcome to Sallys Lemonade Stand!!!!");

            System.out.println("What would you like to do: ");
            System.out.println("1) Create an Account");
            System.out.println("2) Login");
            System.out.println("3) Buy some Lemonade");
            choice = scr.nextInt();

            switch (choice) {
                case 1:
                    createAnAccount();
                    break;
                case 2:
                    account = login();
                    break;
                case 3:
                    buyProduct(account);
                    account = null;
                    break;
                case 1337:
                    System.out.println("Thank you come again.");
                    break;
            }
        } while (choice != 1337);
        //

    }

    public static void createAnAccount() {

        System.out.println("Sign Up for an account!");

        System.out.print("What is your name");
        String name = scr.nextLine();

        System.out.print("What is your email");
        String email = scr.nextLine();

        System.out.print("What is your password");
        String password = scr.nextLine();

        System.out.print("What is your Phone Number");
        String phoneNumber = scr.nextLine();

        Account account = new Account(name, email, password, phoneNumber);

        listOfAccounts.add(account);
    }

    public static Account login() {
        System.out.println("What is your email");
        String email = scr.nextLine();
        System.out.println("What is your password");
        String password = scr.nextLine();

        for (Account account : listOfAccounts) {
            if (email.equals(account.getEmail())
                    && password.equals(account.getPassword())) {
                return account;
            }
        }
        return null;
    }

    public static void buyProduct(Account account) {

        boolean buyMore;
        ArrayList<Product> cart = new ArrayList<Product>();
        do {
            cart = selectAProduct(cart);

            System.out.println("Would you like to buy more?");
            buyMore = scr.nextBoolean();
        } while (buyMore == true);

        Double cost = 0.0;
        for (int i = 0; i < cart.size(); i++) {

            if (account != null) {
                account.getBoughtProducts().add(cart.get(i));
            }
            cost += cart.get(i).getPrice();

            cart.get(i).removeOneProduct();

        }

        boolean loopAgain = false;

        do {
            CreditCard creditCard = createCard(account, cost);

            if (cost > creditCard.getBalance()) {
                System.out.println("Broke people cant shop here.");
                loopAgain = true;
                System.out.println("Enter in a differnt card.");
            } else {
                loopAgain = false;
            }
        } while (loopAgain);

        System.out.println("Thank you for your patronage");

    }

    public static CreditCard createCard(Account account, Double cost) {
        System.out.println("Your total cost will be: " + cost);

        System.out.println("What is your name on the card: ");
        String name = scr.nextLine();

        System.out.println("What is your card number: ");
        String cardNumber = scr.nextLine();

        System.out.println("What is your experiation date on card: ");
        String date = scr.nextLine(); // 2027-04-05
        LocalDate localDate = LocalDate.parse(date);

        System.out.println("What is the card ccv: ");
        String ccv = scr.nextLine();

        System.out.println("What is your zipCode: ");
        String zipCode = scr.nextLine();

        System.out.println("What is the card balance: ");
        Double balance = scr.nextDouble();

        CreditCard creditCard = new CreditCard(name, cardNumber, localDate, ccv, zipCode, balance);

        System.out.println("Would you like to add this card to your account: (Y/N)");
        String yOrN = scr.nextLine();
        if (yOrN.equals("Y") && account != null) {
            account.setCreditCard(creditCard);
        } else if (account == null) {
            System.out.println("Please login to connect card to your account.");
        }

        return creditCard;
    }

    public static ArrayList<Product> selectAProduct(ArrayList<Product> cart) {
        System.out.println("What kind of lemonade would you like: ");

            System.out.println("1) Strawberry Lemonade");
            System.out.println("2) Blueberry Lemonade");
            System.out.println("3) Boneless Watermelon Lemonade");
            System.out.println("4) Special Water");

            int choice = scr.nextInt();
            System.out.println("How many: ");
            int amount = scr.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 1; i <= amount; i++) {
                        cart.add(strLemonade);
                    }
                    break;
                case 2:
                    for (int i = 1; i <= amount; i++) {
                        cart.add(bbrLemonade);
                    }
                    break;
                case 3:
                    for (int i = 1; i <= amount; i++) {
                        cart.add(bwmLemonade);
                    }
                    break;
                case 4:
                    for (int i = 1; i <= amount; i++) {
                        cart.add(sallyWater);
                    }
                    break;
            }

            return cart;
    }

}
