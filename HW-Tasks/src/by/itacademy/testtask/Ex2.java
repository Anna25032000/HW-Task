package by.itacademy.testtask;

import java.util.Scanner;

//Напишите программу расчета даты следующего дня введя 3 числа - день, месяц и год.
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" введите число , месяц, год ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        if (day <= 28 && year % 4 == 0) {
            day ++;
            System.out.println(day + "  " + month + "   " + "  " + year);
        }
        else if (day <= 27 && year % 4 != 0) {
            day ++;
            System.out.println(day + "  " + month + "   " + "  " + year);
        }
        else if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year ++;
            System.out.println(day + "  " + month + "   " + "  " + year);
        }
        else if (day == 31) {
            day = 1;
            month ++;
            System.out.println(day + "  " + month + "   " + "  " + year);
        }
        else if (day == 30 && month % 2 == 0) {
            day ++;

            System.out.println(day + "  " + month + "   " + "  " + year);
        }
        else if (day == 30 && month % 2 != 0) {
            day = 1;
            month ++;
            System.out.println(day + "  " + month + "   " + "  " + year);
        }
        else if (day == 29 && month == 2 && year % 4 == 0) {
            day = 1;
            month ++;
            System.out.println(day + "  " + month + "   " + "  " + year);
        }
        else if (day == 28 && year % 4 != 0 && month ==2) {
            day = 1;
            month ++;
            System.out.println(day + "  " + month + "   " + "  " + year);
        }
        else if (day < 30 && month != 2) {
            day ++;
            System.out.println(day + "  " + month + "   " + "  " + year);
        }
        else if (day == 29 && year % 4 != 0 && month == 2) {
            System.out.println("29 феврвля  в этом году не бывает ");
        }
    }
}
