package by.itacademy.testtask;//Имеется прямоугольное отверстие размером a на b. Определить можно ли полностью закрыть отверстие круглой
// картонкой радиусом r.

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 3 числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r = scanner.nextInt();
        int d_ab = a * a + b * b;
        int d = r * 2;
        int dim = d * d;
        if (d_ab > dim) {
            System.out.println("картонка с радиусом " + r + "  не закрывает отверстие");
        }else
            System.out.println("картонка с радиусом " + r + "   закрывает отверстие");
    }
}




