package by.itacademy.testtask.EX9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp("Lamp", "Hallway", 60, 0.2);
        Iron iron = new Iron("Iron", "Bedroom", 200, 4.0);
        Computer computer = new Computer("Computer", "Cabinet", 220, 3);
        Fridge fridge = new Fridge("Fridge", "Kitchen", 300, 200);
        Stove stove = new Stove("Stove", "Kitchen", 300, 150);
        TV tv = new TV("TV", "Living-room", 200, 30);


        System.out.println("Приборы выключены: " + computer.isOn());
        computer.setIsOn(true);
        lamp.setIsOn(true);
        fridge.setIsOn(true);
        System.out.println("Включил нужные приборы:" + computer.isOn());

        List<Appliance> list = new ArrayList<>();
        list.add(lamp);
        list.add(iron);
        list.add(computer);
        list.add(fridge);
        list.add(stove);
        list.add(tv);

        int wattSum = calculateWatt(list);
        System.out.println("Сумма ватт включенных приборов:" + wattSum);

        sortByWeight(list);
        System.out.println("Все приборы отсортированны по весу:" + list);

        List<Appliance> kitchens = filterByKitchen(list);
        System.out.println("Приборы которые находятся на кухни:" + kitchens);
    }
    private static int calculateWatt(List<Appliance> appliances) {
        int sum = 0;
        for (int i = 0; i < appliances.size(); i++) {
            Appliance appliance = appliances.get(i);
            if (appliance.isOn()) {
                sum += appliance.getWatt();
            }
        }
        return sum;
    }
    private static void sortByWeight(List<Appliance> appliances) {
        appliances.sort(Comparator.comparing(Appliance::getWeight));
    }

    private static List<Appliance> filterByKitchen(List<Appliance> appliances) {
        List<Appliance> list = new ArrayList<>();
        for (int i = 0; i < appliances.size(); i++) {
            Appliance appliance = appliances.get(i);
            if(appliance.getPlace().equals("Kitchen")) {
                list.add(appliance);
            }
        }
        return list;
    }
}

