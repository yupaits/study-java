package designpattern.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * 抽象处理者
 * @author ts495
 * @date 2020/12/5
 */
@Setter
@Getter
public abstract class Handler {
    private Handler next;

    public abstract void handleRequest(String request);
}
