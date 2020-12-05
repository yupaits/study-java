package designpattern.factory.product;

import designpattern.factory.IProduct;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ts495
 * @date 2020/8/3
 */
@Data
public class IPad implements IProduct {
    private String name = "IPad";
    private BigDecimal price = BigDecimal.valueOf(2899.00);
}
