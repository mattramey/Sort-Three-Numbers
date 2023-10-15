
import java.util.Scanner;

public class sortedNumbers {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Prompt the user to enter three numbers
        System.out.print("Enter three numbers starting with the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

// invoke method displaySortedNumbers
        displaySortedNumbers(num1, num2, num3);

// Close Scanner input to avoid reasource leak
        input.close();

        }

//  use if else if statments to print the three numbers in order inside the  displaySortedNumbers method 
        public static void displaySortedNumbers(double num1, double num2, double num3) {
            if (num1 <= num2 && num2 <= num3) {
                System.out.println("The numbers in increasing order are: " + num1 + ", " + num2 + ", " + num3);
            } else if (num1 <= num3 && num3 <= num2) {
                System.out.println("The numbers in increasing order are: " + num1 + ", " + num3 + ", " + num2);
            } else if (num2 <= num1 && num1 <= num3) {
                System.out.println("The numbers in increasing order are: " + num2 + ", " + num1 + ", " + num3);
            } else if (num2 <= num3 && num3 <= num1) {
                System.out.println("The numbers in increasing order are: " + num2 + ", " + num3 + ", " + num1);
            } else if (num3 <= num1 && num1 <= num2) {
                System.out.println("The numbers in increasing order are: " + num3 + ", " + num1 + ", " + num2);
            } else {// num3 <= num2 && num2 <= num1
                System.out.println("The numbers in increasing order are: " + num3 + ", " + num2 + ", " + num1);
            }
    }
}