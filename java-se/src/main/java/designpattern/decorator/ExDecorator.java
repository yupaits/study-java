package designpattern.decorator;

/**
 * 具体装饰角色-增强版装饰器
 * @author ts495
 * @date 2020/8/4
 */
public class ExDecorator extends Decorator {
    private Component component;

    public ExDecorator(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        super.execute();
        afterExecute();
    }

    public void afterExecute() {
        System.out.println("完成执行后触发");
    }
}
