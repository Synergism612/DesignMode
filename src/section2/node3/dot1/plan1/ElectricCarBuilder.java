package section2.node3.dot1.plan1;

public class ElectricCarBuilder extends CarBuilder{
    @Override
    CarBuilder buildCar() {
        this.setCar(new Car());
        return this;
    }

    @Override
    CarBuilder addEngine(String type) {
        this.getCar().setEngine(type);
        return this;
    }

    @Override
    CarBuilder addWheel(String type) {
        this.getCar().setWheel(type);
        return this;
    }

    @Override
    CarBuilder addTransmission(String type) {
        this.getCar().setTransmission(type);
        return this;
    }

    @Override
    CarBuilder addGasTank(String capacity) {
        return this;
    }

    @Override
    CarBuilder addBatteries(String capacity) {
        this.getCar().setBatteries(capacity);
        return this;
    }

    @Override
    CarBuilder paint(String color) {
        this.getCar().setColor(color);
        return this;
    }
}
