package by.itacademy.assessmenttask.Ex5;

public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose("Rose", "red", 20.9, 5);
        Rose blackRose = new Rose("BlackRose", "black", 20.1, 6);
        Carnation carnation = new Carnation("Carnation", "white", 15.8,6);
        Tulip tulip = new Tulip("Tulip", "yellow",10.3, 7);
        Orchid orchid = new Orchid("Orchid", "purple", 20.5,6);


        Bouquet bouquet = new Bouquet(5);
        bouquet.addFlower(rose);
        bouquet.addFlower(tulip);
        bouquet.addFlower(orchid);
        bouquet.addFlower(carnation);
        bouquet.addFlower(blackRose);


        System.out.println("Цена букета: " + bouquet.getBouquetPrice());
        System.out.println("Используемые цвета в букете: " + bouquet.getBouquetColor());
        System.out.println("Букет завянет через: " + bouquet.getLifeTime() + " дней");

    }
}


