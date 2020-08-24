package designpattern.singleton;

/**
 * 单例模式-双重锁检测
 * @author ts495
 * @date 2020/8/3
 */
public class Singleton1 {
    //单例对象
    private volatile static Singleton1 instance = null;

    /**
     * 私有构造方法
     */
    private Singleton1() {}

    public static Singleton1 getInstance() {
        if (instance == null) {
            synchronized (Singleton1.class) {
                if (instance == null) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }

    public void doIt() {
        // Do something...
    }
}
