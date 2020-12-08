package algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 * @author ts495
 * @date 2020/9/16
 */
public class InsertSortSample {
    public static void insertSort(int[] array) {
        for (int i = 2; i < array.length; i++) {
            int val = array[i];
            int j = i - 1;
            // array[j] > val
            while (j >= 0 && array[j] > val) {
                array[j + 1] = array[j];
                j--;
            }
            // array[j + 1]不是array[j]
            array[j + 1] = val;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 3, 5, 20, 13, 24};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
