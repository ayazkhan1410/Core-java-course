package third_chpter_Conditonalstatement;

import java.util.Scanner;

public class lect02_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input;
        int num1, num2;
        System.out.println("Press 1 for sum");
        System.out.println("Press 2 for substraction");
        System.out.println("Press 3 for multiplication");
        user_input = sc.nextInt();
        if (user_input == 1) {
            System.out.println("Enter number one for sum");
            num1 = sc.nextInt();
            System.out.println("Enter number two for sum");
            num2 = sc.nextInt();

            System.out.println("The sum of num1 and num2 is : " + (num1 + num2));
        } else if (user_input == 2) {
            System.out.println("Enter number one for substraction");
            num1 = sc.nextInt();
            System.out.println("Enter number two for substraction");
            num2 = sc.nextInt();

            System.out.println("The substraction of num1 and num2 is : " + (num1 - num2));
        } else if (user_input == 3) {
            System.out.println("Enter number one for multiplication");
            num1 = sc.nextInt();
            System.out.println("Enter number two for multiplication");
            num2 = sc.nextInt();

            System.out.println("The multiplication of num1 and num2 is : " + (num1 * num2));
        } else {
            System.out.println("Please enter a valid number");
        }

    }

}
