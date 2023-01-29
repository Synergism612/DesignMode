package section2.node3.dot1.plan1;

public class Car {
    private String engine = "未知";
    private String wheel = "未知";
    private String transmission = "未知";
    private String gasTank = "未知";
    private String batteries = "未知";
    private String color = "未知";

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getGasTank() {
        return gasTank;
    }

    public void setGasTank(String gasTank) {
        this.gasTank = gasTank;
    }

    public String getBatteries() {
        return batteries;
    }

    public void setBatteries(String batteries) {
        this.batteries = batteries;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheel='" + wheel + '\'' +
                ", transmission='" + transmission + '\'' +
                ", gasTank='" + gasTank + '\'' +
                ", batteries='" + batteries + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void print(){
        System.out.println(this.toString());
    }
}
