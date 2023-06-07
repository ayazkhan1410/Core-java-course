package sixth_chpter_Arrays_in_java;

public class printing_array {
    public static void main(String[] args) {
        // declaring aray
        int[] marks;
        // allocate memory
        marks = new int[5];

        // method 1
        marks[0] = 70;
        marks[1] = 80;
        marks[2] = 90;
        marks[3] = 75;
        marks[4] = 96;

        // printing array using loops

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // printing array

        /*
         * System.out.println("1st element of array is : " + marks[0]);
         * System.out.println("2nd element of array is : " + marks[1]);
         * System.out.println("3rd element of array is : " + marks[2]);
         * System.out.println("4th element of array is : " + marks[3]);
         * System.out.println("5th element of array is : " + marks[4]);
         */
    }

}
