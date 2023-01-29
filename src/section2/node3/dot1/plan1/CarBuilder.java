package section2.node3.dot1.plan1;

public abstract class CarBuilder {

    private Car car;

    abstract CarBuilder buildCar();
    abstract CarBuilder addEngine(String type);
    abstract CarBuilder addWheel(String type);
    abstract CarBuilder addTransmission(String type);
    abstract CarBuilder addGasTank(String capacity);
    abstract CarBuilder addBatteries(String capacity);
    abstract CarBuilder paint(String color);

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
