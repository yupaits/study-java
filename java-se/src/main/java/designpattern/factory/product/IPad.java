package designpattern.factory.product;

import designpattern.factory.IProduct;

import java.math.BigDecimal;

/**
 * @author ts495
 * @date 2020/8/3
 */
public class IPad implements IProduct {
    private String name = "IPad";
    private BigDecimal price = BigDecimal.valueOf(2899.00);

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
        return "IPad{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
