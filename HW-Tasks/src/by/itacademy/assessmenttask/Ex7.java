package by.itacademy.assessmenttask;

import java.util.HashMap;
import java.util.Map;

public class Ex7 {
    public static void main(String[] args) {
        Integer[] newArr = {3, 2, 3, 4, 9, 6, 7, 7, 9, 10};
        System.out.println(arrayToMap(newArr));

        String[] array = {"Stop", "hello", "Stop", "Alex", "HI", "HI"};
        System.out.println(arrayToMap(array));

    }
    private static <K> Map<K, Integer> arrayToMap(K[] arr) {
        Map<K, Integer> map = new HashMap<>();
        for (K key : arr) {
            if (map.containsKey(key)) {
                Integer value = map.get(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }
        return map;
    }
}



