package designpattern.observer;

/**
 * 具体观察者
 * @author ts495
 * @date 2020/8/4
 */
public class ConcreteObserver implements Observer {
    @Override
    public void action() {
        System.out.println("具体观察者1做出动作");
    }
}
