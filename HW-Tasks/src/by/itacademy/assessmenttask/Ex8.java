package by.itacademy.assessmenttask;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex8 {
    public static void main(String[] args) throws Exception {
        File in1 = new File("in1.txt");
        File in2 = new File("in2.txt");

        writeFile(in1);
        writeFile(in2);

        File out = new File("out.txt");
        FileWriter outWriter = new FileWriter(out);
        BufferedWriter outBufferedWriter = new BufferedWriter(outWriter);

        List<Integer> numbers = new ArrayList<>();


        List<Integer> in1Data = readFile(in1);
        List<Integer> in2Data = readFile(in2);
        numbers.addAll(in1Data);
        numbers.addAll(in2Data);

        Collections.sort(numbers);
        for (Integer number : numbers) {
            outBufferedWriter.write(number  + "\n");
        }
        outBufferedWriter.flush();
        outBufferedWriter.close();
    }

    private static void writeFile (File file) throws IOException {
        FileWriter writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            writer.write(random.nextInt(1, 100000) + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static List<Integer> readFile(File file) throws IOException {
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        List<Integer> numbers = new ArrayList<>();
        while (bufferedReader.ready()) {
            String numberString = bufferedReader.readLine();
            int number = Integer.parseInt(numberString);
            numbers.add(number);
        }
        return numbers;
    }
}


