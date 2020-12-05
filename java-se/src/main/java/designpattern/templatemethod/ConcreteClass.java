package designpattern.templatemethod;

/**
 * 具体子类
 * @author ts495
 * @date 2020/12/5
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1被调用");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2被调用");
    }
}
