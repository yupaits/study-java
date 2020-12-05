package designpattern.builder;

import java.math.BigDecimal;

/**
 * 建造者模式
 * @author ts495
 * @date 2020/12/5
 */
public class BuilderSample {

    public static void main(String[] args) {
        System.out.println(">>>>>> 建造者模式：");
        Product iPhone = new ProductBuilder().name("iPhone")
                .desc("iPhone 12 Pro Plus Max")
                .price(BigDecimal.valueOf(8988.00))
                .build();
        System.out.println(iPhone);
        Product huaweiP40 = new ProductBuilder().name("HuaweiP40")
                .price(BigDecimal.valueOf(5988.00))
                .build();
        System.out.println(huaweiP40);
    }
}
