package org.LickingHeights;

import java.time.MonthDay;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int dayOfweek;
        int dayOfmonth;
        int month;
        int year;
        int yearOfcentury;

        int ZellerCongruence;
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
            System.out.println("What is the day you were born");
            dayOfweek = keyboard.nextInt();
            int answer =


            int answer2 = ZellerCongurence(month, year, dayOfmonth);
            System.out.println(answer2);
        }


        public static boolean











        public static int zellerCongruence(int month, int year, int dayOfmonth) {

            if (month == 1 || month == 2) {
                month = (month + 12);
                year--;
            }
            int yearZeroBased;
            yearZeroBased = (year / 100);
            int zellersCongruence;
            zellersCongruence = 13 * (month + 1);
            int yearofCentury;
            yearofCentury = (year % 100);




            int dayofWeek;
            dayofWeek = ((dayOfmonth + ((zellersCongruence) / 5) + yearOfcentury + (yearOfcentury / 4) + ((yearZeroBased) / 4) - (2 * (yearZeroBased))) % 7);
            return dayofWeek;

        }


        public static String MonthPoem(int dayofWeek) {
            if (dayofWeek == 1) {
                return "You were born on Monday \n" +
                        "According to the poem, that means you are fair of face";
            } else if (dayofWeek == 2) {
                return "You were born on Tuesday \n" +
                        "According to the poem, you're the child that is full of grace";
            } else if (dayofWeek == 3) {
                return "You were born on Wednesday \n" +
                        "According to the poem, you are full of woe";
            } else if (dayofWeek == 4) {
                return "You were born on Thursday \n" +
                        "According to the poem, you have far to go";
            } else if (dayofWeek == 5) {
                return "You were born on Friday \n" +
                        "According to the poem, you the child that is loving and giving";
            } else if (dayofWeek == 6) {
                return "You were born on Saturday \n" +
                        "According to the poem, you work hard for a living";
            } else  {
                return "You were born on Sabbath day" +
                        "According to the poem, you are fair and wise in every way";
            }


        }
    }

























