import java.util.Scanner;

public class SafeInput {
    public static int getRangedInt(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print(prompt);
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.printf("Please enter a number between %d and %d.%n", min, max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
