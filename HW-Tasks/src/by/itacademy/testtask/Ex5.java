package by.itacademy.testtask;

import java.util.Scanner;

//Введите число с клавиатуры. Определите, является ли это число простым
public class Ex5 {
    public static void main(String[] args) {
            int i;
            int num;
            System.out.println("введите число");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            boolean isSimple = true;
            for ( i = 2; i < num; i++) {
                if ( num % i == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.println(num + "  число простое");
            }
            else {
                System.out.println(num + "  число не простое");
            }
        }
    }
