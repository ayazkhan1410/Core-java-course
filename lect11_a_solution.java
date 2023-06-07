package second_chpter;
import java.util.Scanner;
public class lect11_a_solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Question 01
         * area = length * breath
         * int l, b;
         * System.out.println("Enter Length");
         * l = sc.nextInt();
         * System.out.println("Enter breath");
         * b = sc.nextInt();
         * 
         * System.out.println("The area is : " + (l * b));
         * 
         * 
         * Question 02
         * volume = length * breath * heigth
         * int l, b, h;
         * System.out.println("Enter Length");
         * l = sc.nextInt();
         * System.out.println("Enter breath");
         * b = sc.nextInt();
         * System.out.println("Enter heigth");
         * h = sc.nextInt();
         * 
         * System.out.println("The volume is : " + (l * b * h));
         * Question 03
         * Float into int
         * float num1 = 1.5f;
         * int num2 = (int) num1;
         * System.out.println(num2);
         */

        // Question 06
        // int to float
        int i;
        float f;
        System.out.println("Enter any integar number");
        i = sc.nextInt();
        System.out.println("Enter any Float number");
        f = sc.nextFloat();

        System.out.println("The sum of int and float is : " + (i + f));

    }

}
