package designpattern.observer;

/**
 * 具体的主题类
 * @author ts495
 * @date 2020/8/4
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("通知观察者");
        for (Observer observer : observers) {
            observer.action();
        }
    }
}
