package section2.node1.dot4;

import section2.node1.dot2.Singleton;

/**
 * 提前加载和延迟加载
 * 在应用开始时就创建单例的实例 叫提前加载
 * 在类被使用前才创建单例的实例 叫延迟加载
 * 新版java的特性导致2.1.3中的无锁的线程安全单例模式示例并不是提前加载
 * 因为类只会在使用时才会被加载，故而现版本java没有实现提前加载的可靠选项
 * 若确实需要提前加载，可以通过在程序的最开始调用getInstance方法达到提前加载的效果
 */
public class Main {
    public static void main(String[] args) {
        //提前加载
        Singleton.getInstance();

        //调用
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }

}
