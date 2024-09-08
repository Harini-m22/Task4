package task4;

import java.util.Scanner;

public class WeekdayLookup {
    public static void main(String[] args) {
        // Array of weekdays starting from Sunday
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day position (0-6): ");

        try {
            int dayIndex = scanner.nextInt();

            // Check if the index is within the valid range
            if (dayIndex >= 0 && dayIndex < weekdays.length) {
                System.out.println("Day: " + weekdays[dayIndex]);
            } else {
                System.out.println("Error: Please enter a valid day index between 0 and 6.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer value.");
        } finally {
            scanner.close();
        }
    }
}

//OUTPUT

//Enter the day position (0-6): 4
//Day: Thursday

//Enter the day position (0-6): 7
//Error: Please enter a valid day index between 0 and 6.

//Enter the day position (0-6): af
//Invalid input. Please enter an integer value.