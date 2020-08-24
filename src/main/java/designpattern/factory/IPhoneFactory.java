package designpattern.factory;

import designpattern.factory.product.IPhone;

/**
 * IPhone工厂实现
 * @author ts495
 * @date 2020/8/3
 */
public class IPhoneFactory implements IFactory {
    @Override
    public IProduct getPhone() {
        return new IPhone();
    }
}
