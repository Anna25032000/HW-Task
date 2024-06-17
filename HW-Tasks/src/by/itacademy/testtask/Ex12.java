package by.itacademy.testtask;

import java.io.*;
import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {


        try (FileOutputStream file = new FileOutputStream("test22.txt");
             BufferedOutputStream binFile = new BufferedOutputStream(file)) {
            int number = 0;
            int sumnumber = 0;
            int count = 0;
            for (int i = 0; i < 30; i++) {
                count++;

                number = new Random().nextInt(0, 100);
                binFile.write(number);
                sumnumber += number;
                System.out.println(number);
                binFile.flush();
            }
            System.out.println("Сумма чисел " + sumnumber);
            System.out.println("Среднее арефмичическое : " + (double) sumnumber/count);
            BufferedReader reader = new BufferedReader(new FileReader("test22.txt"));
            String line;
            System.out.println("мой файл в бинарнов виде :");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}


