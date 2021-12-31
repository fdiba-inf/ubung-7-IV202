package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = input.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        boolean timeValid = HoursValid(hours) && MinutesValid(minutes);
        System.out.println("Time valid: " + timeValid);
    }

    public static boolean HoursValid(int hours) {
        return hours >= 0 && hours < 24;
    }

    public static boolean MinutesValid(int minutes) {
        return minutes >= 0 && minutes < 60;

    }

}