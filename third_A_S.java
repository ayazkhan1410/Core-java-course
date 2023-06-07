package third_chpter_Conditonalstatement;

import java.util.*;

public class third_A_S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, user_input;

        System.out.println("Enter number one");
        num1 = sc.nextDouble();
        System.out.println("Enter number two");
        num2 = sc.nextDouble();

        System.out.println("Press 1 for division");
        System.out.println("Press 2 for remainder");
        user_input = sc.nextDouble();
        if (user_input == 1) {
            System.out.println("The division is : " + (num1 / num2));
        } else if (user_input == 2) {
            System.out.println("The remainder is : " + (num1 % num2));
        } else {
            System.out.println("Pls enter a valid number");
        }

    }

}
