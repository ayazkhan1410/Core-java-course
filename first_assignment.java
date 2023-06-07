package second_chpter;

import java.util.Scanner;

public class first_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("Enter number 1 for division");
        a = sc.nextDouble(); // 5
        System.out.println("Enter number 2 for division");
        b = sc.nextDouble(); // 6

        System.out.println("The remainder of a and b is : " + (a % b));

    }
}
