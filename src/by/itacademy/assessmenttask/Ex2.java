package by.itacademy.assessmenttask;

import java.util.Scanner;
//Улитка поднимается по дереву на a футов в день. Затем каждую ночь улитка сползает вниз на b футов. Высота дерева — h футов.
//Напишите программу с подсчетом количества дней, которые потребуются улитке, чтобы добраться до вершины дерева.
//Если улитка не может добраться до вершины дерева, должно выводиться сообщение: Невозможно.

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        System.out.println("Введите число h: ");
        int h = scanner.nextInt();

        if (a >= h) {
            System.out.println("Улитка достигнет вершины за 1 день");
        } else {
            // вычислим, сколько дней улитке потребуется для того, чтобы достичь вершины дерева
            int day = 1;
            int h1 = h - a;

            while (h1 > 0) {
                h1 += b; // увеличиваем высоту на величину спуска
                h1 -= a; // уменьшаем на подъем
                day++;

                if (h1 <= 0) {
                    System.out.println("Улитка достигнет вершины за " + day + " дней");
                }
            }
            // если улитка не может достичь вершины, то выводим невозможно
            if (h1 > 0) {
                System.out.println("Невозможно");
            }
        }
    }
}

