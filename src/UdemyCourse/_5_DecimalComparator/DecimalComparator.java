package UdemyCourse._5_DecimalComparator;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double a, double b){

       int number1 = (int)(a*1000);
       int number2 = (int)(b*1000);


        if (number1 == number2 ) {
            return true;
        }
        else {
            return false;

        }
    }
}
