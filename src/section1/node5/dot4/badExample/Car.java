package section1.node5.dot4.badExample;

public class Car extends Vehicle implements ICar {

    public Car(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + this.name + '\'' +
                '}';
    }

    @Override
    public void repair() {
        System.out.println("repair");
    }

    @Override
    public void sell() {
        System.out.println("sell");
    }
}
