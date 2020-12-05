package designpattern.strategy;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 策略工厂
 * @author ts495
 * @date 2020/12/5
 */
public class StrategyFactory {

    Map<String, Strategy> strategys = Maps.newHashMap();

    public void put(String key, Strategy strategy) {
        strategys.put(key, strategy);
    }

    public void get(String key) {
        strategys.get(key);
    }

    public void strategyMethod(String key) {
        strategys.get(key).strategyMethod();
    }
}
