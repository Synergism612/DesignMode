package section2.node3.dot1.plan1;

public class Main {
    /**
     * 建造者模式
     */
    public static void main(String[] args) {
        CarBuilderDirector.buildElectricCar(new ElectricCarBuilder()).print();
    }
}
