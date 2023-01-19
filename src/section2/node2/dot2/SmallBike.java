package section2.node2.dot2;

public class SmallBike implements Vehicle{
    private String color;

    @Override
    public void println() {
        String name = "bike";
        String size = "small";
        System.out.println("SmallBike{" +
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
