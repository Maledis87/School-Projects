import java.util.Scanner;

public class Module3 {


    public Module3() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coupon amount as a decimal (e.g., 0.10): ");
        double coupon = scanner.nextDouble();
        if (coupon <= 0 || coupon > 1) {
            coupon = 0.10;
        }

        double[] weeklyBills = new double[4];
        double total = 0;

        for (int i = 0; i < 4; i++) {
            System.out.printf("Enter grocery bill for week %d: ", i + 1);
            weeklyBills[i] = scanner.nextDouble();
            total += weeklyBills[i];
        }

        double weeklyAverage = total / 4;
        double monthlyTotalWithCoupon = total * (1 - coupon);
        double weeklyAverageWithCoupon = monthlyTotalWithCoupon / 4;

        System.out.printf("Monthly total without coupon: $%.2f\n", total);
        System.out.printf("Weekly average without coupon: $%.2f\n", weeklyAverage);
        System.out.printf("Monthly total with coupon: $%.2f\n", monthlyTotalWithCoupon);
        System.out.printf("Weekly average with coupon: $%.2f\n", weeklyAverageWithCoupon);

        scanner.close();
    }
}