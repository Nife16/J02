package homework;

import java.util.Scanner;

public class GroupExercise1 {
    

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);


        System.out.println("How much cash ya got: ");
        double amount = scr.nextDouble();

        System.out.println("What are you converting to-> 1) Clout, 2) Gwap, 3) Fetti: ");
        int choice = scr.nextInt();

        double fettiRate = 1.0/1738.0;
        double gwapRate = 1.0/1017.0;

        if(choice == 1) {
            cloutRateFunc(amount);
        } else if(choice == 2) {
            System.out.println("Fetti: " + (fettiRate*amount));
        } else if(choice == 3) {
            System.out.println("Gwap: " + (gwapRate*amount));
        }

        scr.close();

    
    }

    public static void cloutRateFunc(double amount) {
        double cloutRate = 1.0/10.0;
        System.out.println("Clout: " + (cloutRate*amount));
    }

}
