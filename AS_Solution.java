package fourth_chp_loops;

import java.util.*;

public class AS_Solution {
    public static void main(String[] args) {
        // step 0 --> must input user name and then display welcome ----- welcome to
        Scanner sc = new Scanner(System.in);
        String name;
        double money;
        int user_input;
        double totalamount;
        byte choice;
        do {
            System.out.println("Enter your name sir");
            name = sc.nextLine();
            System.out.println("-------------------------------------");
            System.out.println("Welcome " + name + " to our program");
            System.out.println("-------------------------------------");

            System.out.println("Enter money you want to convert");
            money = sc.nextDouble(); // 200
            System.out.println("-------------------------------------");
            // menu
            System.out.println("Press 1 to convert dollar into rupees ");
            System.out.println("press 2 to convert ruppess into dollar");
            System.out.println("press 3 to convert euro into ruppess");
            System.out.println("press 4 to convert ruppess into euro");
            user_input = sc.nextInt();

            // step 5 --> base condition if,else
            if (user_input == 1) {
                totalamount = money * 172;
                System.out.println("-------------------------------------");
                System.out.println("Total Rupees is : " + totalamount);
            } else if (user_input == 2) {
                totalamount = money / 172;
                System.out.println("-------------------------------------");
                System.out.println("Total dollars is  : " + totalamount);
            } else if (user_input == 3) {
                totalamount = money * 320;
                System.out.println("-------------------------------------");
                System.out.println("Total Rupees is : " + totalamount);
            } else if (user_input == 4) {
                totalamount = money / 320;
                System.out.println("-------------------------------------");
                System.out.println("Total euro is : " + totalamount);
            } else {
                System.out.println("-------------------------------------");
                System.out.println("Pls enter valid number sir");
            }

            System.out.println("If you want to convert more money press 1 otherwise press any key to exit");
            choice = sc.nextByte();
        } while (choice == 1);

    }

}
