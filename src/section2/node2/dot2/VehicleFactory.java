package section2.node2.dot2;

/**
 * 工厂方法模式示例
 * 交通工具类工厂
 * 将创建方法抽象化，具体的实例化操作交给子类
 * 订单生成方法则负责获取实例，写入颜色或进行其他操作
 */
public abstract class VehicleFactory {

    protected abstract Vehicle create (String size);

    /**
     * 根据信息生成订单
     */
    public Vehicle orderVehicle(String size,String color){
        Vehicle vehicle = create(size);
        vehicle.setColor(color);
        return vehicle;
    }
}
