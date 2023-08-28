//Question: Write a program in java to count total no. of words in a string.

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("Total Number of Words: " + wordCount);

        scanner.close();
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+");
        return words.length;
    }
}
