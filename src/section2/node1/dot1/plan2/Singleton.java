package section2.node1.dot1.plan2;

/**
 * 同步锁单例模式示例 2
 * 在getInstance()内部的创建实例代码用synchronized代码块包含
 * 由此声明线程(同步)安全
 * 保证在同一时刻最多只有一个线程执行该段代码
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton is Instantiated.");
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Something is Done.");
    }
}
