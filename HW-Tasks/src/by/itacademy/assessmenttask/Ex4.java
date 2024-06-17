package by.itacademy.assessmenttask;
//Дан текст. Подсчитайте уникальное количество слов в тексте. Учитывайте, что слова могут
// разделяться несколькими пробелами, знаками препинания. Пробелы могут присутствовать так же в начале и конце текста.
public class Ex4 {
    public static void main(String[] args) {
        String str1 = "Listen to the news from today and read the text at the same time. " +
                "Listen to the news from today without reading the text.";
        String[] words = str1.split("[ ,.!?]+");

        System.out.println(str1);
        String[] uniqueWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.isEmpty()) {
                continue;
            }
            boolean isWordUnique = true;
            for (String element : uniqueWords) {
                if (word.equalsIgnoreCase(element)) {
                    isWordUnique = false;
                    break;
                }
            }
            if(isWordUnique) {
                uniqueWords[i] = word;
            }
        }
        int countOfUniqueWords = 0;
        for (String uniqueWord : uniqueWords) {
            if (uniqueWord != null) {
                countOfUniqueWords++;
            }
        }
        System.out.println("Number of unique words: " + countOfUniqueWords);
    }
}


