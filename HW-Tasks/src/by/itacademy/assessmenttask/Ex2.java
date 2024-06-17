package by.itacademy.assessmenttask;

import java.util.Scanner;
//Улитка поднимается по дереву на a футов в день. Затем каждую ночь улитка сползает вниз на b футов. Высота дерева — h футов.
//Напишите программу с подсчетом количества дней, которые потребуются улитке, чтобы добраться до вершины дерева.
//Если улитка не может добраться до вершины дерева, должно выводиться сообщение: Невозможно.

public class Ex2 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        System.out.println("введите три значения, расстояние за день вверх, за ночь вниз и высота");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        if (a > b && a < h) {
            while (sum <= h) {
                i++;
                sum = sum + a;
                if (sum >= h) {
                    System.out.println("количество дней: " + i);
                    break;
                }
                sum = sum - b;
            }
        } else if (a > h) {
            System.out.println("1 день");
        } else System.out.println("никогда");
    }
}
