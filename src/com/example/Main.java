package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("What month do you need?");
            String chooseMonth = scan1.nextLine().toUpperCase();

            Month month = Month.valueOf(chooseMonth);

            switch (month) {
                case JANUARY:
                    System.out.println("January is: " + Month.JANUARY.getKoreanName() + "\n");
                case FEBRUARY:
                    System.out.println("February is: " + Month.FEBRUARY.getKoreanName() + "\n");
                case MARCH:
                    System.out.println("March is: " + Month.MARCH.getKoreanName() + "\n");
                case APRIL:
                    System.out.println("April is: " + Month.APRIL.getKoreanName() + "\n");
                case MAY:
                    System.out.println("May is: " + Month.MAY.getKoreanName() + "\n");
                case JUNE:
                    System.out.println("June is: " + Month.JUNE.getKoreanName() + "\n");
                case JULY:
                    System.out.println("July is: " + Month.JULY.getKoreanName() + "\n");
                case AUGUST:
                    System.out.println("August is: " + Month.AUGUST.getKoreanName() + "\n");
                case SEPTEMBER:
                    System.out.println("September is: " + Month.SEPTEMBER.getKoreanName() + "\n");
                case OCTOBER:
                    System.out.println("October is: " + Month.OCTOBER.getKoreanName() + "\n");
                case NOVEMBER:
                    System.out.println("November is: " + Month.NOVEMBER.getKoreanName() + "\n");
                case DECEMBER:
                    System.out.println("December is: " + Month.DECEMBER.getKoreanName() + "\n");
                    break;
                default:
                    System.out.println("Month is not existing\n");

            }

            String addToMonthList = chooseMonth;

            if (addToMonthList == "january" || addToMonthList == "february" || addToMonthList == "march" || addToMonthList == "april" || addToMonthList == "may" || addToMonthList == "june" || addToMonthList == "july" || addToMonthList == "august" || addToMonthList == "september" || addToMonthList == "october" || addToMonthList == "november" || addToMonthList == "december") {
                addToMonthList = chooseMonth;
            }


            switch (addToMonthList) {
                case "january":
                    System.out.println("January is added to the Month list\n");
                    break;
                case "february":
                    System.out.println("February is added to the Month list\n");
                    break;
                case "march":
                    System.out.println("March is added to the Month list\n");
                    break;
                case "april":
                    System.out.println("April is added to the Month list\n");
                    break;
                case "may":
                    System.out.println("May is added to the Month list\n");
                    break;
                case "juine":
                    System.out.println("June is added to the Month list\n");
                    break;
                case "july":
                    System.out.println("July is added to the Month list\n");
                    break;
                case "august":
                    System.out.println("August is added to the Month list\n");
                    break;
                case "september":
                    System.out.println("September is added to the Month list\n");
                    break;
                case "october":
                    System.out.println("October is added to the Month list\n");
                    break;
                case "november":
                    System.out.println("November is added to the Month list\n");
                    break;
                case "december":
                    System.out.println("December is added to the Month list\n");
                    break;
                default:
                    System.out.println("Nothing is added to the Month list\n");

            }

            List<String> monthList = new ArrayList<String>();
            monthList.add(addToMonthList.toUpperCase());

            monthList.forEach(System.out::println);
        } catch (InputMismatchException ignore) {

        }

    }
}
