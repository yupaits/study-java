package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题类
 * @author ts495
 * @date 2020/8/4
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    /**
     * 增加观察者
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     */
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public abstract void notifyObserver();
}
