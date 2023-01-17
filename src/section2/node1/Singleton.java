package section2.node1;

/**
 * 单例模式示例类
 * 构造函数为私有的，通过getInstance()来取出(创建)唯一一个实例instance
 * 该单例模式在多线程时存在问题
 * 若两个线程同时调用该单例
 * 就会小概率出现实例化两次的问题
 * 为此我们需要同步锁
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton is Instantiated.");
    }

    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("Something is Done.");
    }
}
