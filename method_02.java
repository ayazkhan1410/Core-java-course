package sixth_chpter_Arrays_in_java;

import java.util.*;

public class method_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks"); // 50,60,70,80,90
            marks[i] = sc.nextInt();
        }
        System.out.println("---------------------");
        System.out.println("Marks are : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

    }

}
