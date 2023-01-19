package section2.node2.dot2;

public class LargeTruck implements Vehicle{
    private String color;

    @Override
    public void println() {
        String name = "truck";
        String size = "large";
        System.out.println("LargeTruck{" +
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
