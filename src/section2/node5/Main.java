package section2.node5;

public class Main {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool(1,2);
        IPooledObject object1 =  objectPool.borrowObject();
        IPooledObject object2 =  objectPool.borrowObject();
        IPooledObject object3 =  objectPool.borrowObject();
        object1.operation();
        object2.operation();
        //第三次就会抛出空指针异常，因为对象池最大只有2
        object3.operation();
    }
}
