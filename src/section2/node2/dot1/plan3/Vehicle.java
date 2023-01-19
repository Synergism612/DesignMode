package section2.node2.dot1.plan3;

public abstract class Vehicle {
    private String name;

    public abstract Vehicle newInstance();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void run();
}
