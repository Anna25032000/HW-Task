package by.itacademy.testtask;

import java.util.Random;

//Найти максимальный и минимальные элементы массива и вывести их индексы на экран.
public class Ex6 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = new Random().nextInt(0,50);
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Минимальный индекс: " + minIndex);
        System.out.println("Максимальный индекс: " + maxIndex);
    }
}
