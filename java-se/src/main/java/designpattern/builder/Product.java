package designpattern.builder;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 产品
 * @author ts495
 * @date 2020/12/5
 */
@Data
public class Product {

    private String name;

    private String desc;

    private BigDecimal price;
}
