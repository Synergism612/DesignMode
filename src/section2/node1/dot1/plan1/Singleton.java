package section2.node1.dot1.plan1;

/**
 * 同步锁单例模式示例 1
 * 在getInstance()上使用synchronized修饰符来声明这个函数是线程(同步)安全的
 * 保证在同一时刻最多只有一个线程执行该函数
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton is Instantiated.");
    }

    public synchronized static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("Something is Done.");
    }
}
