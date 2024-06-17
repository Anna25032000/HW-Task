package by.itacademy.assessmenttask.EX10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileArrayCreator {
    public static void main(String[] args) {
        createFileWithRandomNumbers("array1.txt", 10);
        createFileWithRandomNumbers("array2.txt", 15);
        createFileWithRandomNumbers("array3.txt", 20);
    }

    private static void createFileWithRandomNumbers(String fileName, int count) {
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(String.valueOf(count));
            writer.newLine();
            for (int i = 0; i < count; i++) {
                int number = random.nextInt(100);
                writer.write(Integer.toString(number));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

