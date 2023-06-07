package sixth_chpter_Arrays_in_java;

import java.util.*;

public class fifth_AS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_element, ind;

        System.out.println("Enter number of element");
        no_element = sc.nextInt();
        int arr[] = new int[no_element]; // 5
        int brr[] = new int[no_element + 1]; // 6

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value : "); // 10 20 30 40 50
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index where you want to insert new value");
        ind = sc.nextInt(); // 2

        System.out.println("Enter value");
        int value = sc.nextInt(); // 750

        for (int i = 0; i < brr.length; i++) { // 10 20 30 40 50
            if (i < ind) {
                brr[i] = arr[i];
            } else if (i == ind) {
                brr[i] = value;
            } else {
                brr[i] = arr[i - 1]; // 3-1
            }

        }

        System.out.print("Values are : ");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]);
            System.out.print(",");
        }

    }

}
