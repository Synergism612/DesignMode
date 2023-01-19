package section2.node2.dot2;

/**
 * 汽车工厂
 * 该类继承交通工具类
 * 负责
 */
public class CarFactory extends VehicleFactory{
    @Override
    protected Vehicle create(String size) {
        if (size.equals("small")){
            return new SportCar();
        }else if (size.equals("large")){
            return new SedanCar();
        }
        return null;
    }
}
