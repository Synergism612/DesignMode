package section2.node2.dot2;

public class SmallTruck implements Vehicle{
    private String color;

    @Override
    public void println() {
        String name = "truck";
        String size = "small";
        System.out.println("SmallTruck{" +
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
