package by.itacademy.assessmenttask.EX10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayStatistics {
    public static void main(String[] args) {
        String[] fileNames = {"array1.txt", "array2.txt", "array3.txt"};

        for (String fileName : fileNames) {
            List<Integer> numbers = readNumbersFromFile(fileName);

            if (!numbers.isEmpty()) {
                int sum = calculateSum(numbers);
                double average = calculateAverage(numbers);

                System.out.println("File: " + fileName);
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);
                System.out.println();
            }
        }
    }

    private static List<Integer> readNumbersFromFile(String fileName) {
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null) {
                int count = Integer.parseInt(line);
                for (int i = 0; i < count; i++) {
                    line = reader.readLine();
                    if (line != null) {
                        numbers.add(Integer.parseInt(line));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbers;
    }

    private static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = calculateSum(numbers);
        return (double) sum / numbers.size();
    }
}

