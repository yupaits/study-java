package designpattern.decorator;

/**
 * 装饰器模式示例
 * @author ts495
 * @date 2020/8/4
 */
public class DecoratorSample {

    public static void main(String[] args) {
        Component component = new ComponentImpl();
        component.execute();
        Decorator decorator = new Decorator(component);
        decorator.execute();
        Decorator exDecorator = new ExDecorator(decorator);
        exDecorator.execute();
    }
}
