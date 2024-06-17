package by.itacademy.assessmenttask;
//Создать двумерный квадратный массив размера n. Заполнить его случайными числами таким образом:
//числа по диагонали равны 0;
//вверху и снизу от пересечения диагоналей находятся только положительные числа (> 0);
//слева и справа от пересечения диагоналей находятся только отрицательные числа (< 0);
//Вывести массив на экран.
//Найти сумму всех элементов;
//Найти среднее арифметическое всех элементов, которые больше суммы всех элементов;
import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {

    int [][] a = new int[7][7];
        int sum = 0;
        double isANumbers = a.length * a.length;
        double arithmetic;

        System.out.println("размер массива: " + a.length);
        for (int i = 0; i < a.length; i++) {
            boolean isBeforeZero = true;
            for (int j = 0; j < a[i].length; j++) {

                int number;
                number = new Random().nextInt(1,10);
                if (j == i) {
                    System.out.print(" " + 0);
                    isBeforeZero = false;
                }
                else if (i == (a.length - 1) - j) {
                    isBeforeZero = false;
                    System.out.print(" " + 0);
                }
                else if(j == a.length - 1) {
                    number = new Random().nextInt(-9,0);
                    int rez3 = number;
                    System.out.print(rez3);
                    sum += rez3;
                }
                else if (i == a.length - 1 || i == 0) {
                    number = new Random().nextInt(1,10);
                    int rez1 = number;
                    System.out.print(" " + rez1);
                    sum += rez1;
                }
                else if (i - j < 0 && i > (a.length - 1) - j ) {
                    number = new Random().nextInt(-9,0);
                    int rez5 = number;
                    System.out.print(rez5);
                    sum += rez5;
                }
                else {
                    if (isBeforeZero) {
                        number = new Random().nextInt(-9,0);
                        int rez4 = number;
                        System.out.print(rez4);
                        sum += rez4;
                    }
                    else {
                        System.out.print(" " + number);
                        sum += number;
                    }
                }
                System.out.print("  ");
            }
            System.out.println();
        }
        arithmetic = sum / isANumbers;
        System.out.println(" ================= ");

        System.out.println("сумма всех элементов: " + sum);
        if (arithmetic > sum) {
            System.out.println("среднее арефмитическая " + arithmetic + ": больше суммы всех элементов ");
        }
        else {
            System.out.println( "сумма всех элементов, больше среднего арефмитического " + sum + " : " + arithmetic);
        }
    }
}
