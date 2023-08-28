//Question: Write a program in java to count consonents, vowels, special characters in a string.

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        int vowelsCount = countVowels(input);
        int consonantsCount = countConsonants(input);
        int specialCharsCount = countSpecialCharacters(input);

        System.out.println("Vowels Count: " + vowelsCount);
        System.out.println("Consonants Count: " + consonantsCount);
        System.out.println("Special characters Count: " + specialCharsCount);

        scanner.close();
    }

    public static int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != ' ') {
                count++;
            }
        }
        return count;
    }

    public static int countSpecialCharacters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == ' ')) {
                count++;
            }
        }
        return count;
    }

}
