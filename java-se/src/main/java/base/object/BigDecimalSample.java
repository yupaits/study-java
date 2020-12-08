/*
 * Copyright (c) 2020, S.F. Express Inc. All rights reserved.
 */
package base.object;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal使用示例
 * @author 01401957
 * @date 2020/12/8
 */
public class BigDecimalSample {

    public static void main(String[] args) {
        //String转BigDecimal
        BigDecimal num1 = new BigDecimal("365.63578");
        //long转BigDecimal
        BigDecimal num2 = BigDecimal.valueOf(240L);
        //double转BigDecimal
        BigDecimal num3 = BigDecimal.valueOf(586.39);

        BigDecimal sum = num1.add(num2);
        BigDecimal delta = num3.subtract(num2);
        BigDecimal multiplication = num1.multiply(num3);
        int scale = 10;
        BigDecimal oriQuotient = num3.divide(num1, scale, RoundingMode.CEILING);
        BigDecimal quotient = num3.divide(num1, RoundingMode.HALF_UP);

        System.out.printf("%s + %s = %s%n", num1, num2, sum);
        System.out.printf("%s - %s = %s%n", num3, num2, delta);
        System.out.printf("%s * %s = %s%n", num1, num3, multiplication);
        System.out.printf("%s / %s = %s, scale: %d, rounding mode: %s%n", num3, num1, oriQuotient, scale, RoundingMode.CEILING);
        System.out.printf("%s / %s = %s, scale: %d, rounding mode: %s%n", num3, num1, quotient, quotient.scale(), RoundingMode.HALF_UP);
    }
}
