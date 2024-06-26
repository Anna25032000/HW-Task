package by.itacademy.testtask;
//В американской армии считается несчастливым число 13, а в японской — 4. Перед международными учениями штаб российской
// армии решил исключить номера боевой техники, содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040),
// чтобы не смущать иностранных коллег. Если в распоряжении армии имеется 100 тысяч единиц боевой техники.
// Каждая боевая машина имеет номер от 00001 до 99999 Напишите программу, которая рассчитает количество номеров,
// исключенных из списка.
//⚠️ Нельзя использовать строки при решении данной задачи

public class Ex4 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 99999; i++) {
            if (containsDigit(i, 4) || containsDigit(i, 13)) {
                count++;
            }
        }

        System.out.println("Количество номеров, которые были исключены: " + count);
    }
    //проверяем есть ли цифры 4 и 13 в числе
    public static boolean containsDigit(int number, int digit) {
        while (number != 0) {
            if (number % 10 == digit) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
