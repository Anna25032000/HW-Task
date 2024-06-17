package by.itacademy.testtask;

//Дан текст. Поменяйте местами первое самое длинное слово с последним самым коротким.
public class Ex8 {
    public static void main(String[] args) {
        String text = "Algorithms are used as specifications for performing calculations and data processing.";
        System.out.println(text);
        String[] words = text.split("[ ,.!?]+");


        String longWord = words[0];
        String shortWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longWord.length()) {
                longWord = words[i];
            }
            if (words[i].length() <= shortWord.length()) {
                shortWord = words[i];
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(longWord)) {
                words[i] = shortWord;
            } else if (words[i].equals(shortWord)) {
                words[i] = longWord;
            }
        }
        String res = String.join(" ",words);
        System.out.println(res);
    }
}
