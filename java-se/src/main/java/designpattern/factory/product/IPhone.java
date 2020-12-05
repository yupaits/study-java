package designpattern.factory.product;

import designpattern.factory.IProduct;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ts495
 * @date 2020/8/3
 */
@Data
public class IPhone implements IProduct {
    private String name = "IPhone";
    private BigDecimal price = BigDecimal.valueOf(5899.00);
}
