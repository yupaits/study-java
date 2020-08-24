package designpattern.factory;

import designpattern.factory.product.IPad;
import designpattern.factory.product.IPhone;

/**
 * 抽象工厂实现
 * @author ts495
 * @date 2020/8/3
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public IProduct getPhone() {
        return new IPhone();
    }

    @Override
    public IProduct getPad() {
        return new IPad();
    }
}
