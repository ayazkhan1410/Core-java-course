package eigth_chpter_OOP;

import java.util.*;

public class lect03_mathclass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int randno = (int) (Math.random() * 8888);
        System.out.println(randno);

        System.out.println("Enter otp");
        String otp = sc.nextLine();
        if (otp.length() == 4) {
            if (otp.equals(String.valueOf(randno))) {
                System.out.println("OTP is verified");
            } else {
                System.out.println("OTP is wrong");
            }
        } else {
            System.out.println("OTP must have 4 numbers");
        }

    }

}

// // max
// int max = Math.max(25, 15);
// System.out.println(max);

// // min
// int min = Math.min(45, 25);
// System.out.println(min);

// // abs
// int abs = Math.abs(-10);
// System.out.println(abs);

// // sqrt
// double sqrt = Math.sqrt(81);
// System.out.println(sqrt);

// // random
// int rand = (int) (Math.random() * 9999);
// System.out.println(rand);