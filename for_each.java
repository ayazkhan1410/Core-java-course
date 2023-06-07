package sixth_chpter_Arrays_in_java;

public class for_each {
    public static void main(String[] args) {
        int marks[] = { 60, 80, 78, 45, 98 };

        // printing using for loop
        System.out.println("Using FOR LOOP");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println(" ");
        // printing using for-each loop
        System.out.println("Using For-each loop");
        for (int a : marks) {
            System.out.print(a + " ");
        }

    }

}
