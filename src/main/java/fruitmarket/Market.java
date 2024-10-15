package fruitmarket;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple(546);
        ((Apple) apple).removeSeeds();

        Apple apple2 = new Apple(345);
        apple2.removeSeeds();

        Banana banana = new Banana(75);
        banana.peel();

        Fruit banana2 = new Banana(75);
        ((Banana) banana2).peel();

    }
}
