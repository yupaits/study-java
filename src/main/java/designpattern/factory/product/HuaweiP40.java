package designpattern.factory.product;

import designpattern.factory.IProduct;

import java.math.BigDecimal;

/**
 * @author ts495
 * @date 2020/8/3
 */
public class HuaweiP40 implements IProduct {
    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(5988.00);
    }
}
