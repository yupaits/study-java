package designpattern.proxy;

/**
 * 代理
 * @author ts495
 * @date 2020/12/5
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("预处理");
    }

    public void postRequest() {
        System.out.println("后续处理");
    }
}
