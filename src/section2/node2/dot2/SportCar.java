package section2.node2.dot2;

public class SportCar implements Vehicle{
    private String color;

    @Override
    public void println() {
        String name = "car";
        String size = "small";
        System.out.println("SportCar{" +
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
