package designpattern.builder;

import java.math.BigDecimal;

/**
 * @author ts495
 * @date 2020/12/5
 */
public class ProductBuilder extends Builder {
    @Override
    public Builder name(String name) {
        product.setName(name);
        return this;
    }

    @Override
    public Builder desc(String desc) {
        product.setDesc(desc);
        return this;
    }

    @Override
    public Builder price(BigDecimal price) {
        product.setPrice(price);
        return this;
    }
}
