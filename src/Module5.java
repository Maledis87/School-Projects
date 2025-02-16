import java.util.ArrayList;
import java.util.Scanner;

public class Module5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();


        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        System.out.println("Enter average temperature for each day");
        for (String day : days) {
            System.out.print(day + ": ");
            double temp = scanner.nextDouble();
            temperatures.add(temp);
        }


    while (true) {
        System.out.println("\nEnter a day of the week to view its temperature, or type 'week' to view all temperaturesa and the weekly average. Type 'exit' to quit: ");
        String input = scanner.next();

        if (input.equalsIgnoreCase("exit")) {
            break;
        } else if (input.equalsIgnoreCase("week")) {
            double sum = 0;
            System.out.println("\nWeekly Temperatures:");
            for (int i = 0; i < days.size(); i++) {
                System.out.println(days.get(i) + ": " + temperatures.get(i) + "F");
                sum += temperatures.get(i);
            }
            double average = sum / days.size();
            System.out.println("weekely Average Temperatures" + average + "F");
        } else if (days.contains(input)) {
            int index = days.indexOf(input);
            System.out.println(input + "'s Temperature: " + temperatures.get(index) + "F");
        } else {
            System.out.println("Invalid input. Please enter a valid day of the week or 'week'.");
        }
    }
}
}
