package by.itacademy.assessmenttask.Ex5;

public class Flower {
    private String name;
    private String color;
    private double price;
    private int period;

    public Flower(String brand, String color, double price, int period) {
        this.name = brand;
        this.color = color;
        this.price = price;
        this.period = period;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getPeriod() {
        return period;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", period=" + period +
                '}';
    }
}


