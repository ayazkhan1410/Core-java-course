package third_chpter_Conditonalstatement;

import java.util.Scanner;

public class lect01_if_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        if (num1 == 100) {
            System.out.println(num1);
        } else {
            System.out.println("Incorrect number");
        }

    }

}
