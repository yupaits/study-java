package designpattern.chainofresponsibility;

/**
 * 处理者1
 * @author ts495
 * @date 2020/12/5
 */
public class FirstHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        System.out.println(String.format("处理者1对 %s 进行处理", request));
        System.out.println("处理者1完成处理");
        if (getNext() == null) {
            return;
        }
        getNext().handleRequest(request);
    }
}
