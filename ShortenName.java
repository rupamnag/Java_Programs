//Question: Write a program in java to shorten a inputted name.
// Example-
//input: Ravi Kumar Shaw
//output: R.K.Shaw

import java.util.Scanner;

public class ShortenName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Name: ");
        String name = scanner.nextLine();

        String shortenedName = getShortenedName(name);
        System.out.println("Shortened Name: " + shortenedName);

        scanner.close();
    }

    public static String getShortenedName(String fullName) {
        String[] parts = fullName.split(" ");
        StringBuilder shortenedName = new StringBuilder();

        if (parts.length > 0) {
            shortenedName.append(parts[0].charAt(0)).append(".");

            if (parts.length > 1) {
                if (parts.length > 2) {
                    for (int i = 1; i < parts.length - 1; i++) {
                        shortenedName.append(parts[i].charAt(0)).append(".");
                    }
                }
                shortenedName.append(parts[parts.length - 1]);
            }
        }

        return shortenedName.toString();
    }
}
