package third_chpter_Conditonalstatement;

import java.util.*;

public class Switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input;
        int num1;
        int num2;

        System.out.println("Enter number 1");
        num1 = sc.nextInt();
        System.out.println("Enter number 2");
        num2 = sc.nextInt();

        System.out.println("Press 1 for sum");
        System.out.println("Press 2 for substraction");
        user_input = sc.nextInt();
        switch (user_input) {
            case 1: {
                System.out.println("The sum is : " + (num1 + num2));
                break;
            }
            case 2: {
                System.out.println("The substraction is : " + (num1 - num2));
                break;
            }
            default: {
                System.out.println("Pls enter valid number ");
            }

        }

    }

}
