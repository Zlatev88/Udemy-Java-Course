package UdemyCourse._4_LeapYearCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println(LeapYear.isLeapYear(year));
    }
}
