package section2.node2.dot2;

public class LargeBike implements Vehicle{
    private String color;

    @Override
    public void println() {
        String name = "bike";
        String size = "large";
        System.out.println("LargeBike{" +
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
