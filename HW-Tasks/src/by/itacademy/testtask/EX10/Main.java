package by.itacademy.testtask.EX10;

public class Main {
    public static void main(String[] args) {
        Stackable<Integer> myStackable = new MyStack();
        myStackable.push(3);
        myStackable.push(2);
        myStackable.push(6);
        myStackable.push(4);
        myStackable.push(5);
        myStackable.push(1);
        myStackable.push(10);
        System.out.println(myStackable.pop());
        System.out.println(myStackable.max());
        System.out.println(myStackable);

    }
}
