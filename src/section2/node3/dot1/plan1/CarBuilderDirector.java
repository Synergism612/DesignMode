package section2.node3.dot1.plan1;

/**
 * 导演类
 */
public class CarBuilderDirector {
    public static Car buildElectricCar(CarBuilder builder){
        return builder.buildCar()
        .addEngine("Electric 150 kW")
        .addBatteries("1500 kWh")
        .addTransmission("Manual")
        .addWheel("20x12x30x4")
        .paint("red")
        .getCar();
    }
}
