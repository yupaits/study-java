package designpattern.observer;

/**
 * 观察者模式
 * @author ts495
 * @date 2020/8/4
 */
public class ObserverSample {

    public static void main(String[] args) {
        System.out.println(">>>>>> 观察者模式：");
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver2();
        subject.add(observer);
        subject.add(observer2);
        subject.notifyObserver();
    }
}
