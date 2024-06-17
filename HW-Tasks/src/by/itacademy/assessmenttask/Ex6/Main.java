package by.itacademy.assessmenttask.Ex6;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10, "Java");

        System.out.println("возвращает первый элемент: " + pair.getFirst());
        System.out.println("возвращает второй элемент: " + pair.getLast());
        System.out.println("элементы поменялись местами: " + pair.swap());

        pair.replaceFirst(20);
        pair.replaceLast("Alex");

        System.out.println("элементы после замены: " + pair);
    }
}


