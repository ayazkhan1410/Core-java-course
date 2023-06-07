package sixth_chpter_Arrays_in_java;

import java.util.*;

public class del_specific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_element, ind;

        System.out.println("Enter number of element");
        no_element = sc.nextInt();
        int arr[] = new int[no_element]; // 5
        int brr[] = new int[no_element - 1]; // 6

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value : "); // 10 20 30 40 50
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index where you want to delete value");
        ind = sc.nextInt(); // 2

        for (int i = 0; i < arr.length; i++) {
            if (i < ind) { // 10 20
                brr[i] = arr[i];
            } else if (i == ind) { // kch nhi
                continue;
            } else {
                brr[i - 1] = arr[i]; // 40 50
            }

        }
        System.out.print("Values are : ");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]);
            System.out.print(",");
        }
    }

}
