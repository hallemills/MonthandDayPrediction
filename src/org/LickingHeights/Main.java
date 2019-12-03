package org.LickingHeights;

import java.time.MonthDay;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int dayOfWeek;
        int dayOfmonth;
        int month;
        int year;
        int yearOfcentury;
        int monthPoem;


        int amountOfdaysInmonth;
        int answer;
        Scanner keyboard;
        keyboard = new Scanner(System.in);


        if {


            System.out.println("Monday's child is fair of face");
            System.out.println("Tuesday's child is full of grace");
            System.out.println("Wednesday's child is full of woe");
            System.out.println("Thursday's child has far to go");
            System.out.println("Friday's child is loving and giving");
            System.out.println("Saturday's child works hard for a living");
            System.out.println("But the child born on Sabbath Day");
            System.out.println("Is fair and wise and good in every way");

            System.out.println("What year were you born?");
            year = keyboard.nextInt();

            System.out.println("What month were you born, give me the number");
            month = keyboard.nextInt();

            System.out.println("What is the day you were born?");
            dayOfWeek = keyboard.nextInt();

            System.out.println("What is the month you were born?");
            month = keyboard.nextInt();

            System.out.println("What is the year vou were born?");
            year = keyboard.nextInt();

            System.out.print("If you were born *month");


        }
    }


    public static int month(int dayOfmonth) {


        switch (dayOfmonth) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:

        }
    }

}
    public static int ZellerCongurence(int month, int year) {

    
        if (month == 1 || month == 2) {
            month = (month + 12);
            year--;

        }
        int yearZeroBased;
        yearZeroBased = (year / 100);
        int ZellerCongurence;
        ZellerCongurence = 13 * (month + 1);
        int yearOfCentury;
        yearOfCentury = (year % 100);
    }


    public static String MonthPoem(int dayOfweek) {
        if (dayOfweek == 1) {
            return "You were born on a Monday \n" +
                    "According to the poem you are fair of face ";
        } else if (dayOfweek == 2) {
            return "You were born on a Tuesday \n" +
                    "According to the poem you are fair of face ";
        } else if (dayOfweek == 3) {
            return "You were born on Wednesday \n" +
                    "According to the poem you are full of woe";
        } else if (dayOfweek == 4) {
            return "You were born on Thursday \n" +
                    "According to the poem you have far to go";
        } else if (dayOfweek == 5) {
            return "You were born on Friday \n" +
                    "According to the poem you are loving and giving";
        } else if (dayOfweek == 6) {
            return "You were born on Saturday \n" +
                    "According to the poem you work hard for a living";
        } else {
            return "You were born on Sabbath day \n" +
                    "According to the poem you are fair and wise in every way";

        }
    }
}








































