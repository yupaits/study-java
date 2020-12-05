package designpattern.factory.product;

import designpattern.factory.IProduct;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author ts495
 * @date 2020/8/3
 */
@Data
public class HuaweiP40 implements IProduct {
    private String name = "HuaweiP40";
    private BigDecimal price = BigDecimal.valueOf(5988.00);
}
