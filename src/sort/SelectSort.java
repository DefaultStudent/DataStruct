package sort;

import java.util.Arrays;

/**
 * @author simon
 *
 * 实现选择排序
 */

public class SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 5, 6, 2, 1, 7, 5, 0};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 选择排序
     * @param arr
     */
    public static void selectSort(int[] arr) {

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            // 把当前遍历的数和后面所有的数一次进行比较，并记录下最小数的下标
            for (int j = i + 1; j < arr.length; j++) {
                // 如果后面的数字比minIndex还小
                if (arr[minIndex] > arr[j]) {
                    // 记录下最小的那个数的下标
                    minIndex = j;
                }
            }

            // 如果minIndex和当前遍历的数的下标不一致,说明下标为minIndex比当前遍历的数更小
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
