import java.util.ArrayList;
import java.util.Scanner;
public class tempTracker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Two separate ArrayLists, one for days and one for temperatures
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temps = new ArrayList<>();

        // Initial data entry
            String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("--- Data Entry Phase ---");
        for (String day : weekDays) {
            days.add(day);
            System.out.print("Enter average temperature for " + day + ": ");
            temps.add(scnr.nextDouble());
        }

        // 2. Query Phase
        System.out.print("\nEnter a day (Monday-Sunday) to see the temp, or 'week' for the full report: ");
        String userInput = scnr.next();

        if (userInput.equalsIgnoreCase("week")) {
            double total = 0;
            System.out.println("\n--- Weekly Report ---");
            for (int i = 0; i < days.size(); i++) {
                System.out.printf("%s: %.2f°%n", days.get(i), temps.get(i));
                total += temps.get(i);
            }
            System.out.printf("Weekly Average: %.2f°%n", (total / days.size()));
        }
        else {
            // Check if the day exists in our list
            int index = -1;
            for (int i = 0; i < days.size(); i++) {
                if (days.get(i).equalsIgnoreCase(userInput)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.printf("%s Temperature: %.2f°%n", days.get(index), temps.get(index));
            } else {
                System.out.println("Error: Day not recognized. Please check your spelling.");
            }
        }
    }
}