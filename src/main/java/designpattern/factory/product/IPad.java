package designpattern.factory.product;

import designpattern.factory.IProduct;

import java.math.BigDecimal;

/**
 * @author ts495
 * @date 2020/8/3
 */
public class IPad implements IProduct {
    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(2899.00);
    }
}