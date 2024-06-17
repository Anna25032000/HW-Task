package by.itacademy.assessmenttask;

import java.util.Scanner;

//Напишите программу, которая будет переводить секунды в отформатированный вид - часы, минуты, секунды.
// Слова должны иметь правильное окончание.
//Для более высокого балла добавьте недели и сутки.
//Постарайтесь не выводить данные, значение которых равно 0

public class Ex1 {
    public static void main(String[] args) {

            int sec;
            int min;
            int m;
            int h;
            int hour;
            int d;
            int day;
            int week;

            Scanner scanner = new Scanner(System.in);
            System.out.println("введите  число от 0 до 999999999");

            int s = scanner.nextInt();
            sec = s % 60;
            m = s / 60;
            min = m % 60;
            h = m / 60;
            hour = h % 24;
            d = h / 24;
            day = d % 7;
            week = d / 7;

            if (week != 0) {
                switch (week % 20) {
                    case 1 -> System.out.print(week + " неделя ");
                    case 2, 3, 4 -> System.out.print(week + " недели ");
                    default -> System.out.print(week + " недель ");
                }
            }
            if (day != 0) {
                switch (day % 7) {
                    case 1 -> System.out.print(day + " день ");
                    case 2, 3, 4 -> System.out.print(day + " дня ");
                    default -> System.out.print(day + " дней ");
                }
            }
            if (hour != 0) {
                switch (hour % 20) {
                    case 1 -> System.out.print(hour + " час ");
                    case 2, 3, 4 -> System.out.print(hour + " часа ");
                    default -> System.out.print(hour + " часов ");
                }
            }
            if (min != 0) {
                switch (min % 60) {
                    case 1 -> System.out.print(min + " минута  ");
                    case 2, 3, 4 -> System.out.print(min + " минуты ");
                    case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> System.out.print(min + " минут ");
                    case 21, 31, 41, 51 -> System.out.print(min + " минута ");
                    case 22, 32, 42, 52, 23, 33, 43, 53, 24, 34, 44, 54 -> System.out.print(min + " минуты ");
                    default -> System.out.print(min + " минут ");
                }
            }
            if (sec != 0 || (week == 0 && day == 0 && hour == 0 && min == 0)) {
                switch (sec % 60) {
                    case 1 -> System.out.print(sec + " секунда  ");
                    case 2, 3, 4 -> System.out.print(sec + " секунды ");
                    case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> System.out.print(sec + " секунд ");
                    case 21, 31, 41, 51 -> System.out.print(sec + " секунда ");
                    case 22, 32, 42, 52, 23, 33, 43, 53, 24, 34, 44, 54 -> System.out.print(sec + " секунды ");
                    default -> System.out.print(sec + " секунд ");
                }
            }
        }
    }
