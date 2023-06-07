package fourth_chp_loops;

import java.util.*;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int print;
        int i = 0;
        System.out.println("Enter number you want to print");
        number = sc.nextInt(); // number = 5
        System.out.println("Enter how many times you want to print");
        print = sc.nextInt(); // print = 7

        while (i < print) { // 0 < 7
            System.out.print(number);
            System.out.print(",");
            i++;

        }

    }

}
