package section2.node2.dot1.plan1;

/**
 * 静态工厂模式示例
 * 通过VehicleType判断类型，再分别创建并返回对应的示例
 * 该类只负责Vehicle对象的实例化，符合单一职责原则
 * 但是要想新增一个Vehicle的子类时，需要对其进行修改，违反了开闭原则。
 */
public class VehicleFactory {

    public enum VehicleType {
        Bike, Car, Truck
    }

    public static Vehicle create(VehicleType type) {
        switch (type) {
            case Car:
                return new Car();
            case Bike:
                return new Bike();
            case Truck:
                return new Truck();
            default:
                return null;
        }
    }
}
