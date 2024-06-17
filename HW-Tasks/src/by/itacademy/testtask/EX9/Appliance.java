package by.itacademy.testtask.EX9;

public class Appliance {
    private String name;
    private String place;
    private int watt;
    private boolean isOnField;
    private double weight;


    public Appliance(String name, String place, int watt, double weight) {
        this.name = name;
        this.place = place;
        this.watt = watt;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    public void setIsOn(boolean isOn) {
        this.isOnField = isOn;
    }

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    public boolean isOn() {
        return isOnField;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", watt=" + watt +
                ", isOnField=" + isOnField +
                ", weight=" + weight +
                '}';
    }
}


