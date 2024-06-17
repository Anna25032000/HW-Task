package by.itacademy.testtask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EX11 {
    public static void main(String[] args) {
        try(FileOutputStream file = new FileOutputStream("myfiletest1.txt");
            BufferedOutputStream fileWriter = new BufferedOutputStream(file);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("введите текст для записи в файл, для прекращения записи введите слово - stop");

            String text;
            while (!(text = console.readLine()).equals("stop")) {
                fileWriter.write((text + "\n").getBytes());
                fileWriter.flush();
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        StringBuilder fileReading = new StringBuilder();
        try(FileReader fileReader = new FileReader("myfiletest1.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String boxWord;
            while ((boxWord = bufferedReader.readLine()) != null) {
                fileReading.append(boxWord).append(" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String text = fileReading.toString().replace("stop", "").trim();
        System.out.println("Текст в файле: " + text);
        int symbolCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '!' || ch == '?' || ch == ',' || ch == '.' || ch == ':' || ch == ';') {
                symbolCounter++;
            }
        }
        System.out.println("количество знаков препинания в тексте:" + symbolCounter);

        String[] words = text.split("[ ,.!?;stop:]+");
        List<String> wordsList = new ArrayList<>();
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            wordsList.add(word);
        }
        System.out.println("количество слов в тексте:" + wordsList.size());
    }
}


