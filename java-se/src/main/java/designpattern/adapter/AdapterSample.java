package designpattern.adapter;


/**
 * @author ts495
 * @date 2020/12/5
 */
public class AdapterSample {

    public static void main(String[] args) {
        System.out.println(">>>>>> 类适配器：");
        Target target = new ClassAdapter();
        target.request();

        System.out.println(">>>>>> 对象适配器：");
        target = new ObjectAdapter(new Adaptee());
        target.request();
    }
}
