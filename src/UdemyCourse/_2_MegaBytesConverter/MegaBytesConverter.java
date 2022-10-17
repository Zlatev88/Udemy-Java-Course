package UdemyCourse._2_MegaBytesConverter;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes<0) {
            System.out.println("Invalid Value");
        }
        else {
            int remainder = kiloBytes%1024;
            int megaBytes = Math.round(kiloBytes - remainder)/1000;

            System.out.printf("%d KB = %d MB and %d KB", kiloBytes, megaBytes, remainder);
        }
    }
}
