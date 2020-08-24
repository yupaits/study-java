package designpattern.factory;

/**
 * 抽象工厂模式
 * @author ts495
 * @date 2020/8/3
 */
public interface AbstractFactory {

    IProduct getPhone();

    IProduct getPad();
}
