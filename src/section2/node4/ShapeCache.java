package section2.node4;

import java.util.Hashtable;

/**
 * 模拟数据库缓存
 */
public class ShapeCache {

    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
