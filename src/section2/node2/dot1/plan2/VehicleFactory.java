package section2.node2.dot1.plan2;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用反射机制进行类注册的工厂模式示例
 * 确实解决了添加新类的问题
 * 但是反射机制需要权限，而且反射会降低程序的效率，所以一些情况下应该避免使用反射
 */
public class VehicleFactory {

    private static final Map<String,Class<Vehicle>> registeredProducts = new HashMap<>();

    //IllegalAccessException 构造函数无法访问
    //InstantiationException 如果这 Class 表示抽象类、接口、数组类、基元类型或 void 或者如果该类没有空构造函数
    public static Vehicle create(String type) throws IllegalAccessException, InstantiationException {
        Class<Vehicle> vehicleClass = registeredProducts.get(type);
        return vehicleClass.newInstance();
    }

    public static void registerVehicle(String name,Class<Vehicle> vehicleClass){
        registeredProducts.put(name,vehicleClass);
    }
}
