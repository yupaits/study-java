package designpattern.decorator;

/**
 * 装饰器模式示例
 * @author ts495
 * @date 2020/8/4
 */
public class DecoratorSample {

    public static void main(String[] args) {
        System.out.println(">>>>>> 组件：");
        Component component = new ComponentImpl();
        component.execute();
        System.out.println(">>>>>> 装饰器：");
        Decorator decorator = new Decorator(component);
        decorator.execute();
        System.out.println(">>>>>> 增强装饰器：");
        Decorator exDecorator = new ExDecorator(decorator);
        exDecorator.execute();
    }
}
