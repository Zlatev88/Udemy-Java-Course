package UdemyCourse._8_FeetAndInchtoCm;

public class feetAndInchToCm {
    public static void main(String[] args) {

    }
    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet>=0 || inches <=12 || inches >=0) {

            double feetToCm = feet*30.48;
            double inchesToCm = inches*2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + inchesToCm + " cm");
            return feetToCm + inchesToCm;


        }
        else {
            System.out.println("invalid");
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches>= 0){
             double feet = inches/12;
             double remainingInches = inches%12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);


        }
        else {
            System.out.println("invalid");
            return -1;
        }
    }
}
