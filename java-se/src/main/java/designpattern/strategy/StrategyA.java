package designpattern.strategy;

/**
 * 具体的策略A
 * @author ts495
 * @date 2020/12/5
 */
public class StrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("执行A计划");
    }
}
