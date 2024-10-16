package farm;

public class Duck extends Animal{


    @Override
    public void makeSound(){
        System.out.println("Quack quack");
    }

    @Override
    public void eat() {
        System.out.println("I eat bread");
    }
}
