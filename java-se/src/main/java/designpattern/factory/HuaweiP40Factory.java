package designpattern.factory;

import designpattern.factory.product.HuaweiP40;

/**
 * HuaweiP40工厂实现
 * @author ts495
 * @date 2020/8/3
 */
public class HuaweiP40Factory implements IFactory {
    @Override
    public IProduct getPhone() {
        return new HuaweiP40();
    }
}
