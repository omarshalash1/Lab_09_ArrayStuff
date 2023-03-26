import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] dataPoints = new int[100];

        // Initialize array with random values
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        // Display array values
        for (int value : dataPoints) {
            System.out.printf("%d | ", value);
        }
        System.out.println();

        // Calculate sum and average
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.printf("The sum of the random array dataPoints is: %d%nThe average of the random array dataPoints is: %.2f%n", sum, average);

        // Linear scan (search)
        int targetValue = SafeInput.getRangedInt("Enter an integer between 1 and 100: ", 1, 100);
        int count = 0;
        for (int value : dataPoints) {
            if (value == targetValue) {
                count++;
            }
        }
        System.out.printf("The value %d was found %d times in the array.%n", targetValue, count);

        // Short circuit search
        targetValue = SafeInput.getRangedInt("Enter an integer between 1 and 100: ", 1, 100);
        int index = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == targetValue) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.printf("The value %d was found at array index %d.%n", targetValue, index);
        } else {
            System.out.printf("The value %d was not found in the array.%n", targetValue);
        }

        // Min and max values
        int minValue = dataPoints[0];
        int maxValue = dataPoints[0];
        for (int value : dataPoints) {
            if (value < minValue) {
                minValue = value;
            }
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.printf("Minimum value: %d%nMaximum value: %d%n", minValue, maxValue);

        // Calculate average using static method
        System.out.printf("Average of dataPoints is: %.2f%n", getAverage(dataPoints));
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}
