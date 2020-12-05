package designpattern.proxy;

/**
 * 真实主题
 * @author ts495
 * @date 2020/12/5
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("业务处理");
    }
}
