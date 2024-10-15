package fruitmarket;

public class Banana extends Fruit{

    public Banana(int calories) {
        super(calories);
    }

    public void peel(){
        System.out.println("Peeled");
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made");
    }

}
