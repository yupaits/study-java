package designpattern.chainofresponsibility;

/**
 * 责任链模式
 * @author ts495
 * @date 2020/12/5
 */
public class ChainOfResponsibilitySample {

    public static void main(String[] args) {
        System.out.println(">>>>>> 责任链模式：");
        Handler firstHandler = new FirstHandler();
        Handler secondHandler = new SecondHandler();
        Handler thirdHandler = new ThirdHandler();
        firstHandler.setNext(secondHandler);
        secondHandler.setNext(thirdHandler);
        firstHandler.handleRequest("请求支援");
    }
}
