package fruitmarket;

public class Apple extends Fruit{

    public Apple(int calories) {
        super(calories);
    }

    public void removeSeeds(){
        System.out.println("Seed are removed");
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");
    }

}
