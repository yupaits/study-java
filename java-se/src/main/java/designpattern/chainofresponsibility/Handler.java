package designpattern.chainofresponsibility;

/**
 * 抽象处理者
 * @author ts495
 * @date 2020/12/5
 */
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}
