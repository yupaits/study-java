package designpattern.adapter;

/**
 * 适配器
 * @author ts495
 * @date 2020/8/4
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
