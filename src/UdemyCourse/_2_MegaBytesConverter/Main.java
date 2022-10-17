package UdemyCourse._2_MegaBytesConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kb = Integer.parseInt(scanner.nextLine());

        MegaBytesConverter.printMegaBytesAndKiloBytes(kb);

    }
}
