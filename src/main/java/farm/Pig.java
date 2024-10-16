package farm;

public class Pig extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Oink oink");
    }

    @Override
    public void eat() {
        System.out.println("I eat truffles");
    }
}
