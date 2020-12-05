package designpattern.factory;

import java.math.BigDecimal;

/**
 * 产品接口
 * @author ts495
 * @date 2020/8/3
 */
public interface IProduct {

    String getName();

    /**
     * 获取产品价格
     */
    BigDecimal getPrice();
}
