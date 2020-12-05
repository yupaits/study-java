package designpattern.factory;

/**
 * 工厂方法模式
 * @author ts495
 * @date 2020/8/3
 */
public interface IFactory {
    /**
     * 获取产品
     */
    IProduct getPhone();
}
