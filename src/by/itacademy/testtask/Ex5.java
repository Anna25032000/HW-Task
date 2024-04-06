package by.itacademy.testtask;

import java.util.Scanner;

//Введите число с клавиатуры. Определите, является ли это число простым
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        if (Prime(number)) {
            System.out.println(number + " число является простым");
        } else {
            System.out.println(number + " число не является простым");
        }
    }
    public static boolean Prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


