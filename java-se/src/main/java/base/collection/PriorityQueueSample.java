package base.collection;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.ArrayUtils;

import java.time.DayOfWeek;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author ts495
 * @date 2020/12/5
 */
public class PriorityQueueSample {

    /**
     * 优先级排序规则：
     * 周六 周一 周三 周五 周二 周四 周日
     */
    public static class DatOfWeekComparator implements Comparator<DayOfWeek> {
        private static final int[] SORT_DAYS = {6, 1, 3, 5, 2, 4, 7};

        @Override
        public int compare(DayOfWeek o1, DayOfWeek o2) {
            int index1 = ArrayUtils.indexOf(SORT_DAYS, o1.getValue());
            int index2 = ArrayUtils.indexOf(SORT_DAYS, o2.getValue());
            return index1 - index2;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<DayOfWeek> queue = new PriorityQueue<>(new DatOfWeekComparator());
        queue.addAll(Lists.newArrayList(DayOfWeek.values()));
        int i = 0;
        while (i < queue.size()) {
            System.out.println(queue.poll().getValue());
        }
    }
}
