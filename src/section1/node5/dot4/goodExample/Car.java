package section1.node5.dot4.goodExample;

public class Car extends Vehicle implements IRepairable,ISellable {

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
