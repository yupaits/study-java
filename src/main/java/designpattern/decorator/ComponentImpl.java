package designpattern.decorator;

/**
 * 抽象组件实现
 * @author ts495
 * @date 2020/8/4
 */
public class ComponentImpl implements Component {
    @Override
    public void execute() {
        System.out.println("执行一些内容");
    }
}
