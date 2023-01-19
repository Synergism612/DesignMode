package section2.node2.dot1.plan3;

public class Truck extends Vehicle {
    @Override
    public Vehicle newInstance() {
        return new Truck();
    }
    @Override
    public void run() {
        System.out.println("This truck is running");
    }
}
