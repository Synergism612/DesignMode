package section2.node2.dot1.plan3;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用newInstance方法进行类注册的工厂模式示例
 * 通过在Vehicle类中添加newInstance()抽象方法，他的子类实现该方法返回新的子类实例
 * 这样就可以将一个子类实例注册在Map中，然后通过newInstance()返回一个新的实例
 */
public class VehicleFactory {

    private static final Map<String,Vehicle> registeredProducts = new HashMap<>();

    public static Vehicle create(String type){
        return registeredProducts.get(type).newInstance();
    }

    public static void registerVehicle(String name,Vehicle vehicle){
        registeredProducts.put(name,vehicle);
    }
}
