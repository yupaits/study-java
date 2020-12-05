package designpattern.templatemethod;

/**
 * 模板方法模式
 * @author ts495
 * @date 2020/12/5
 */
public class TemplateMethodSample {

    public static void main(String[] args) {
        System.out.println(">>>>>> 模板方法模式：");
        AbstractClass tm = new ConcreteClass();
        tm.templateMethod();
    }
}
