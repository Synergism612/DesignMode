package section1.node5.dot4.goodExample;

public class Vehicle {
    public String name;
    public Vehicle(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
