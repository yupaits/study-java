package designpattern.strategy;

/**
 * 策略模式
 * @author ts495
 * @date 2020/12/5
 */
public class StrategySample {

    public static void main(String[] args) {
        System.out.println(">>>>>> 策略模式：");
        StrategyFactory strategyFactory = new StrategyFactory();
        strategyFactory.put("A", new StrategyA());
        strategyFactory.put("B", new StrategyB());
        strategyFactory.strategyMethod("A");
        strategyFactory.strategyMethod("B");
    }
}
