package designpattern.factory;

import designpattern.factory.product.HuaweiP40;
import designpattern.factory.product.MatePadPro;

/**
 * 抽象工厂实现
 * @author ts495
 * @date 2020/8/3
 */
public class HuaweiFactory implements AbstractFactory {
    @Override
    public IProduct getPhone() {
        return new HuaweiP40();
    }

    @Override
    public IProduct getPad() {
        return new MatePadPro();
    }
}
