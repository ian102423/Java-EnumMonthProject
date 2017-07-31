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
            String chosenMonth = scan1.nextLine().toUpperCase();

            Month month = Month.valueOf(chosenMonth);

            switch (month) {
                case JANUARY:
                case FEBRUARY:
                case MARCH:
                case APRIL:
                case MAY:
                case JUNE:
                case JULY:
                case AUGUST:
                case SEPTEMBER:
                case OCTOBER:
                case NOVEMBER:
                case DECEMBER:
                    System.out.printf("%s is: " + month.getKoreanName() + "\n", month);
                    break;
                default:
                    System.out.println("Month is not existing\n");

            }

            switch (chosenMonth.toLowerCase()) {
                case "january":
                case "february":
                case "march":
                case "april":
                case "may":
                case "juine":
                case "july":
                case "august":
                case "september":
                case "october":
                case "november":
                case "december":
                    System.out.printf("%s is added to the Month list\n", chosenMonth);
                    break;
                default:
                    System.out.println("Nothing is added to the Month list\n");

            }

            List<String> monthList = new ArrayList<String>();
            monthList.add(chosenMonth.toUpperCase());

            monthList.forEach(System.out::println);
        } catch (InputMismatchException ignore) {

        }

    }
}
