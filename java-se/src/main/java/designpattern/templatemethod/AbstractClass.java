package designpattern.templatemethod;

/**
 * 抽象类
 * @author ts495
 * @date 2020/12/5
 */
public abstract class AbstractClass {

    /**
     * 模板方法
     */
    public void templateMethod() {
        specificMethod1();
        abstractMethod1();
        specificMethod2();
        abstractMethod2();
    }

    /**
     * 具体方法1
     */
    public void specificMethod1() {
        System.out.println("抽象类中的具体方法1被调用");
    }

    /**
     * 具体方法2
     */
    public void specificMethod2() {
        System.out.println("抽象类中的具体方法2被调用");
    }

    public abstract void abstractMethod1();

    public abstract void abstractMethod2();
}
