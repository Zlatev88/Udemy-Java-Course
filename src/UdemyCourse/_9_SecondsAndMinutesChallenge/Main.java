package UdemyCourse._9_SecondsAndMinutesChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString (int minutes, int seconds){
        if (minutes >=0 && seconds>=0 && seconds <=59) {

            int hours = minutes/60;
            int leftMinutes = minutes%60;
            String hoursString = String.valueOf(hours);
            String minutesString = String.valueOf(leftMinutes);
            String secondsString = String.valueOf(seconds);
            if (hours<10) {
                 hoursString = "0" + hours;
            }
            if (leftMinutes<10) {
                 minutesString = "0" + leftMinutes;
            }
            if (seconds<10) {
                 secondsString = "0" + seconds;
            }


                return String.format("%sh, %sm, %ss", hoursString, minutesString, secondsString);


        }
        else {
            return "Invalid value";
        }
    }
    public static String getDurationString (int seconds){
        if (seconds<0) {
            return "Invalid value";
        }
        else {
            int minutes = seconds/60;
            int leftSeconds = seconds%60;
            return getDurationString(minutes, leftSeconds);
        }
    }


}
