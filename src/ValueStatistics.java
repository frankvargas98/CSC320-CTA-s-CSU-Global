import java.util.Scanner;

public class ValueStatistics {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Loop control and statistics variables
        int count = 0;
        double currentVal;
        double total = 0.0;
        double max = 0.0;
        double min = 0.0;

        System.out.println("Please enter five floating-point values:");

        // The while-loop with a sentinel/counter to prevent an endless loop
        while (count < 5) {
            System.out.print("Enter value " + (count + 1) + ": ");
            currentVal = scnr.nextDouble();

            total += currentVal;

            // Logic to track Max and Min
            if (count == 0) { // First entry initialization
                max = currentVal;
                min = currentVal;
            } else {
                if (currentVal > max) {
                    max = currentVal;
                }
                if (currentVal < min) {
                    min = currentVal;
                }
            }

            // MANDATORY: Update the counter to prevent an endless loop
            count++;
        }

        // Calculations
        double average = total / 5;
        double interest = total * 0.20;

        // Output results
        System.out.println("\n--- Results ---");
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Maximum: %.2f%n", max);
        System.out.printf("Minimum: %.2f%n", min);
        System.out.printf("Interest on Total (20%%): %.2f%n", interest);
    }
}