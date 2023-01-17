package section2.node1.dot2;

/**
 * 双重校验锁机制的同步锁单例模式示例
 * 在2.1.2中的单例模式示例虽然可以实现，但是其效率会大大降低
 * 因为函数getInstance()或者其内容代码块是线程唯一的，所以多个线程调用时就会导致延迟大大增加
 * 故而我们可以使用双重校验来规避延迟问题
 * 通过在synchronized代码块外增加一重判断，可以只在创建实例时运行一次同步代码，规避延迟
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton is Instantiated.");
    }

    public static Singleton getInstance(){
        if (instance==null){
            synchronized(Singleton.class){
                if (instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("Something is Done.");
    }
}
