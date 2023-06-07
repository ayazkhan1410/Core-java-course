package sixth_chpter_Arrays_in_java;

public class two_d_array {
    public static void main(String[] args) {
        int[][] flats = new int[2][3];
        // 2 row ,3 columns

        // 1st row
        flats[0][0] = 1;
        flats[0][1] = 2;
        flats[0][2] = 3;
        // 2nd row
        flats[1][0] = 11;
        flats[1][1] = 12;
        flats[1][2] = 13;

        for (int i = 0; i < flats.length; i++) { // 2
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

}
