package UdemyCourse._8_FeetAndInchtoCm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foot = Double.parseDouble(scanner.nextLine());
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = feetAndInchToCm.calcFeetAndInchesToCentimeters(foot,inches);
        if(centimeters <0.0) {
            System.out.println("Invalid parameters");
        }

        feetAndInchToCm.calcFeetAndInchesToCentimeters(inches);
    }
}
