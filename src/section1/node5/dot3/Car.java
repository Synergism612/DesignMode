package section1.node5.dot3;

public class Car extends Vehicle {
    public String masterName;
    public Boolean lock = null;

    public Car(String name, String masterName) {
        super(name);
        this.masterName = masterName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + this.name + '\'' +
                "masterName='" + this.masterName + '\'' +
                '}';
    }

    void lock() {
        this.lock = true;
    }

    void unlock(Key key){
        this.lock = !key.masterName.equals(this.masterName);
    }
}
