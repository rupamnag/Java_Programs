//Question: Write a program in java to find the largest of 3 numbers using nested if.

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the Third Number: ");
        int num3 = scanner.nextInt();

        int largest;

        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }

        System.out.println("The Largest Number is: " + largest);

        scanner.close();
    }
}
