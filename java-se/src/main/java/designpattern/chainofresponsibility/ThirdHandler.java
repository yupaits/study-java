package designpattern.chainofresponsibility;

/**
 * @author ts495
 * @date 2020/12/5
 */
public class ThirdHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        System.out.println(String.format("处理者3对 %s 进行处理", request));
        System.out.println("处理者3完成处理");
        if (getNext() == null) {
            return;
        }
        getNext().handleRequest(request);
    }
}
