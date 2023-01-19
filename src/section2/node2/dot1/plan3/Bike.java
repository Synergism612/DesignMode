package section2.node2.dot1.plan3;

public class Bike extends Vehicle {
    @Override
    public Vehicle newInstance() {
        return new Bike();
    }

    @Override
    public void run() {
        System.out.println("The bike is running.");
    }
}
