import java.util.Scanner;

public class TaxCalculator {
    static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //Initializing variables
        double weeklyIncome;
        double taxRate;
        double taxWithholding;

        //User input
        System.out.print("Enter your weekly income: ");
        weeklyIncome = scnr.nextDouble();

        //Selection structure
        if (weeklyIncome < 750) {
            taxRate = 0.10;
        } else if (weeklyIncome >= 750 && weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome >= 1500 && weeklyIncome < 2200) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }
        //Calculation of tax rate
        taxWithholding = weeklyIncome * taxRate;

        //Output
        System.out.println("-----------------------------------");
        System.out.printf("Weekly Income: $%.2f%n", weeklyIncome);
        System.out.println("Tax Rate: " + (int) (taxRate * 100) + "%");
        System.out.printf("Weekly Tax Withholding: $%.2f%n", taxWithholding);
        System.out.println("-----------------------------------");
    }
}