package section2.node2.dot1.plan3;

public class Car extends Vehicle {
    @Override
    public Vehicle newInstance() {
        return new Car();
    }
    @Override
    public void run() {
        System.out.println("The car is running.");
    }
}
