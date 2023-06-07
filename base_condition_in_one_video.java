package third_chpter_Conditonalstatement;

public class base_condition_in_one_video {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        byte n1 = 8, n2 = 6;
        char operator = '+';
        switch (operator) { // +
            case '+': {
                System.out.println("Result is : " + (n1 + n2));
                break;
            }
            case '-': {
                System.out.println("Result is : " + (n1 - n2));
                break;
            }
            default: {
                System.out.println("Inavlid operator");
            }

        }

    }
}

// case 1
/*
 * int number = 12;
 * if (number > 0) {
 * System.out.println("Positive number");
 * }
 * System.out.println("Code is working");
 */
/*
 * case
 * int number = -11;
 * if (number > 0) { //-11>0
 * System.out.println("Positive number");
 * }
 * System.out.println("Negative number");
 */
/*
 * int number = 10;
 * if (number > 0) { // 10>0
 * System.out.println("Number is greater then 0");
 * } else {
 * System.out.println("Number is 0");
 * }
 * System.out.println("Code outside the statement");
 */
// case 2
/*
 * int number = -5;
 * if (number > 0) {
 * System.out.println("Number is positive");
 * } else {
 * System.out.println("Number is negative");
 * }
 * System.out.println("Code outside the body");
 */
/*
 * int user_input;
 * 
 * System.out.println("Press 1 for sum");
 * System.out.println("Press 2 for substraction");
 * user_input = sc.nextInt();
 * 
 * if (user_input == 1) {
 * System.out.println("Enter number one for sum");
 * double n1 = sc.nextDouble();
 * System.out.println("Enter number two for sum");
 * double n2 = sc.nextDouble();
 * 
 * System.out.println("The sum is : " + (n1 + n2));
 * } else if (user_input == 2) {
 * System.out.println("Enter number one for substraction");
 * double n1 = sc.nextDouble();
 * System.out.println("Enter number two for substraction");
 * double n2 = sc.nextDouble();
 * 
 * System.out.println("The substraction is : " + (n1 - n2));
 * } else {
 * System.out.println("Invalid number");
 * }
 */