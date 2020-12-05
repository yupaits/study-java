package designpattern.factory.product;

import designpattern.factory.IProduct;

import java.math.BigDecimal;

/**
 * @author ts495
 * @date 2020/8/3
 */
public class MatePadPro implements IProduct {
    private String name = "MatePadPro";
    private BigDecimal price = BigDecimal.valueOf(3299.00);

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
        return "MatePadPro{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
