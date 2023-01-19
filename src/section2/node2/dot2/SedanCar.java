package section2.node2.dot2;

public class SedanCar implements Vehicle{
    private String color;

    @Override
    public void println() {
        String name = "car";
        String size = "large";
        System.out.println("SedanCar{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}');
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
