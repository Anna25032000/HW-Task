package by.itacademy.testtask;

import java.util.Random;
import java.util.Scanner;

//Создать массив заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать.
// При перевороте элементов не желательно создавать еще один массив.
public class Ex7 {
    public static void main(String[] args) {
            int[] arr = new int[7];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Random().nextInt(-50, 51);
                System.out.print(arr[i] + "  ");
            }
            System.out.println("   ");
            int length = arr.length;
            for (int i = 0; i < arr.length / 2; i++) {
                int num = arr[i];
                arr[i] = arr[length - 1 - i];
                arr[length - 1 - i] = num;
            }
            for (int j : arr) {
                System.out.print(j + "  ");
            }
        }
    }
