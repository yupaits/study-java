package designpattern.singleton;

/**
 * 单例模式-静态内部类
 * @author ts495
 * @date 2020/8/3
 */
public class Singleton2 {

    private static class LazyHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
