package section1.node5.dot3;

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
