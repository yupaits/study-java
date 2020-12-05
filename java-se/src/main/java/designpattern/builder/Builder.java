package designpattern.builder;

import java.math.BigDecimal;

/**
 * @author ts495
 * @date 2020/12/5
 */
public abstract class Builder {
    /**
     * 创建产品对象
     */
    protected Product product = new Product();

    public abstract Builder name(String name);

    public abstract Builder desc(String desc);

    public abstract Builder price(BigDecimal price);

    public Product build() {
        return product;
    }
}
