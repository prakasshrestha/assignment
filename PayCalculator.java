package pratina_c0929902_a1;
import java.util.Scanner;

public class PayCalculator {
    public static void main(String[] args) {
        // Constants
        final double BASE_PAY_RATE = 10.0; // Will's base pay rate
        final double OVERTIME_MULTIPLIER = 1.5; // Overtime pay multiplier

        // Input hours worked and bonus hours
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();
        System.out.print("Enter bonus hours: ");
        double bonusHours = scanner.nextDouble();
        scanner.close();

        // Calculate total pay
        double totalPay;
        if (hoursWorked > 40) {
            double regularPay = 40 * BASE_PAY_RATE;
            double overtimePay = (hoursWorked - 40 + bonusHours) * OVERTIME_MULTIPLIER * BASE_PAY_RATE;
            totalPay = regularPay + overtimePay;
        } else {
            totalPay = (hoursWorked + bonusHours) * BASE_PAY_RATE;
        }

        // Print final pay
        System.out.println("Will's final pay: $" + totalPay);
    }
}