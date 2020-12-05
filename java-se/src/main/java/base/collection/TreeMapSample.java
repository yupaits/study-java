package base.collection;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Comparator;
import java.util.Map;

/**
 * @author ts495
 * @date 2020/12/5
 */
public class TreeMapSample {

    /**
     * 字符串排序规则：
     * 1. KEYS_SORT中的字符串比其他字符串排序靠前
     * 2. KEYS_SORT中序号越小的字符串排序越靠前
     * 3. 非KEYS_SORT的字符串按默认的字符串排序规则自然排序
     */
    public static class CustomComparator implements Comparator<String> {
        private static final String[] KEYS_SORT = {"BBB", "AAA", "SSS", "EEE", "TTT", "MMM"};

        @Override
        public int compare(String o1, String o2) {
            int index1 = ArrayUtils.indexOf(KEYS_SORT, o1);
            int index2 = ArrayUtils.indexOf(KEYS_SORT, o2);
            if (index1 >= 0) {
                if (index2 < 0) {
                    return -1;
                }
                return index1 - index2;
            }
            if (index2 >= 0) {
                return 1;
            }
            return o1.compareTo(o2);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> scoreMap = Maps.newTreeMap(new CustomComparator());
        scoreMap.put("AAA", 100);
        scoreMap.put("BBB", 102);
        scoreMap.put("CCC", 98);
        scoreMap.put("DDD", 120);
        scoreMap.put("EEE", 108);
        scoreMap.put("FFF", 88);
        scoreMap.put("GGG", 92);
        scoreMap.put("MMM", 96);
        scoreMap.put("TTT", 110);
        scoreMap.put("SSS", 106);
        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            System.out.println(String.format("%s: %s", entry.getKey(), entry.getValue()));
        }
    }
}
