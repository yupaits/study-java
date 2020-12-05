package designpattern.observer;

/**
 * 具体观察者2
 * @author ts495
 * @date 2020/8/4
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void action() {
        System.out.println("具体观察者2做出动作");
    }
}
