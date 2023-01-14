package section1.node5.dot4.badExample;

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
