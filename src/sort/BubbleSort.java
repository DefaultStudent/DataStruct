package sort;

import java.util.Arrays;

/**
 * @author simon
 *
 * 冒泡排序实现
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 8, 9, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序
     *
     * 5, 7, 8, 9, 2, 3, 4, 5 共需要比较length - 1轮，最开始的数字不需要和自己比
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        // 控制一共比较多少轮
        for (int i = 0; i < arr.length - 1; i++) {

            // 控制比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // 进行交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
