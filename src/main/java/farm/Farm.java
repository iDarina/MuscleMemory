package farm;

public class Farm {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.makeSound();
        pig.eat();

        Animal duck = new Duck();
        duck.makeSound();
        duck.eat();

        Duck duck2 = new Duck();
        duck2.makeSound();
        duck2.eat();

    }


}
