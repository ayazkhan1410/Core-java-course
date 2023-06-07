package eigth_chpter_OOP;

import java.util.Scanner;

import java.util.*;

public class lect02_method {

    static void F2C(Scanner sc) {
        double Fahrenhiet, result;
        System.out.println("Enter temprature in Fahrenhiet");
        Fahrenhiet = sc.nextDouble();
        result = (Fahrenhiet - 32) * 5 / 9;
        System.out.println("Temprature is : " + result + " C");
    }

    static void C2F(Scanner sc) {
        double Celsius, result;
        System.out.println("Enter temprature in Fahrenhiet");
        Celsius = sc.nextDouble();
        result = (Celsius * 9 / 5) + 32;
        System.out.println("Temprature is : " + result + " F");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 to convert Fahrenhiet into Celsius");
        System.out.println("Press 2 to convert Celsius into Fahrenhiet");
        int choice = sc.nextInt();

        if (choice == 1) {
            F2C(sc);
        } else {
            C2F(sc);
        }
    }

}
