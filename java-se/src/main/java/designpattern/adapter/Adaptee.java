package designpattern.adapter;

/**
 * 适配者
 * @author ts495
 * @date 2020/8/4
 */
public class Adaptee {

    public void specificRequest() {
        System.out.println("适配者业务代码被调用");
    }
}
