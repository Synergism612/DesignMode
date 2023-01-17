package section2.node1.dot3;

/**
 * 无锁的线程安全单例模式
 * 回想java类的组成中，是否存在一种可以完美实现单例模式的组成？
 * 通过声明时直接进行实例化静态常量成员的方式来保证一个类只可能有一个实例
 * 这种实现方式避免了同步锁机制导和判断带来的额外检查
 */
public class LockFreeSingleton {
    private static final LockFreeSingleton instance = new LockFreeSingleton();

    //私有化的构造方法可以让外部无法使用构造方法构造新的实例
    private LockFreeSingleton(){}

    static {
        System.out.println("Singleton is Instantiated");
    }

    public static synchronized LockFreeSingleton getInstance(){
        return instance;
    }

    public void doSomething(){
        System.out.println("Something is Done.");
    }

}
