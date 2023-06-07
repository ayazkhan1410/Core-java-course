package sixth_chpter_Arrays_in_java;

public class method_3 {
    public static void main(String[] args) {
        int[] marks = { 50, 60, 70, 80 };
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        System.out.println("Total marks is : " + total);

    }

}
