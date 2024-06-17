package by.itacademy.assessmenttask.Ex5;

public class Bouquet {
    private final Flower[] flowers;

    public Bouquet(int capacity) {
        flowers = new Flower[capacity];
    }
    public void addFlower(Flower flower) {
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] == null) {
                flowers[i] = flower;
                break;
            }
        }
    }

    public double getBouquetPrice() {
        double sum = 0;
        for (int i = 0; i < flowers.length; i++) {
            sum += flowers[i].getPrice();
        }
        return sum;
    }

    public String getBouquetColor() {
        String colors = "";
        for (int i = 0; i < flowers.length; i++) {
            colors += flowers[i].getColor();
            colors += " ";
        }
        return colors;
    }

    public int getLifeTime() {
        int maxDay = 0;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].getPeriod() > maxDay ) {
                maxDay = flowers[i].getPeriod();
            }
        }
        return maxDay;
    }
}


