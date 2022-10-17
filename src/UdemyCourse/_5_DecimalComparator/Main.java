package UdemyCourse._5_DecimalComparator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(a, b));
    }
}
