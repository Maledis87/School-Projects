import java.util.Scanner;

public class Module4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double[] values = new double[5];
       int counter = 0;

    while (counter < 5) {
        System.out.print("Enter floating-point Value #" + (counter + 1) + ": ");
        if (scanner.hasNextDouble()) {
            values[counter] = scanner.nextDouble();
            counter++;
        } else {
            System.out.println("Invalid input. Please enter a valid floating-point number.");
            scanner.next();
        }
       }

    double total = 0;
    double max = values[0];
    double min = values[0];

    for (double value : values) {
        total += value;
        if (value > max) max = value;
        if (value < min) min = value;
    }
    double average = total / 5;
    double interest = total * 0.20;
  
    System.out.println("Total: " + total);
    System.out.println("Average: " + average);
    System.out.println("Maximum: " + max);
    System.out.println("Minimum: " + min);
    System.out.println("Interest on total at 20%: " + interest);

        scanner.close();
}
}