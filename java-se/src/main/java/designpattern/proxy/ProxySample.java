package designpattern.proxy;

/**
 * 代理模式
 * @author ts495
 * @date 2020/12/5
 */
public class ProxySample {

    public static void main(String[] args) {
        System.out.println(">>>>>> 代理模式：");
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
