package designpattern.decorator;

/**
 * 抽象装饰角色
 * @author ts495
 * @date 2020/8/4
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void execute() {
        component.execute();
    }
}
