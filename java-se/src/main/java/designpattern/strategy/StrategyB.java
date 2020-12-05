package designpattern.strategy;

/**
 * 具体的策略B
 * @author ts495
 * @date 2020/12/5
 */
public class StrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("执行B计划");
    }
}
