package designpattern.factory.product;

import designpattern.factory.IProduct;

import java.math.BigDecimal;

/**
 * @author ts495
 * @date 2020/8/3
 */
public class HuaweiP40 implements IProduct {
    private String name = "HuaweiP40";
    private BigDecimal price = BigDecimal.valueOf(5988.00);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "HuaweiP40{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
