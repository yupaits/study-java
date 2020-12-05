package designpattern.adapter;

/**
 * 类适配器
 * @author ts495
 * @date 2020/8/4
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
