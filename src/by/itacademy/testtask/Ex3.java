package by.itacademy.testtask;
//На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
// оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9:00 часов утра — табло отображает 28800
// (т.е. остаётся 8 часов). Когда время 14:30 — на табло 9000 (т.е. остаётся два с половиной часа). А когда наступает
// 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
//Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
// Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные
// фразы с информацией о том, сколько полных часов осталось до конца рабочего дня. Например: осталось 7 часов,
// осталось 4 часа, остался 1 час, осталось менее часа.
//Итак, в переменную n должно записываться случайное (на время тестирования программы)
// целое число из промежутка [0;28800]. Далее оно должно выводиться на экран (для Петрова) и на
// следующей строке (для сотрудниц) должна выводиться фраза о количестве полных часов, содержащихся в n секундах.

public class Ex3 {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 28800);
        if (n > 25200 && n < 28800) {
            System.out.println(n);
            System.out.println("Осталось 8 часов");
        }
        if (n > 21600 && n < 25200) {
            System.out.println(n);
            System.out.println("Осталось 7 часов");
        }
        if (n > 18000 && n < 21600) {
            System.out.println(n);
            System.out.println("Осталось 6 часов");
        }
        if (n > 14400 && n < 18000) {
            System.out.println(n);
            System.out.println("Осталось 5 часов");
        }
        if (n > 10800 && n < 14400) {
            System.out.println(n);
            System.out.println("Осталось 4 часа");
        }
        if (n > 7200 && n < 10800) {
            System.out.println(n);
            System.out.println("Осталось 3 часа");
        }
        if (n > 3600 && n < 7200) {
            System.out.println(n);
            System.out.println("Осталось 2 часа");
        }
        if (n > 0 && n < 3600) {
            System.out.println(n);
            System.out.println("Осталось менее часа");
        }
        if (n == 0) {
            System.out.println(n);
            System.out.println("Рабочий день окончен");
        }
    }
}
