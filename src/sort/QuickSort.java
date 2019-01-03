package sort;

import java.util.Arrays;

/**
 * @author simon
 *
 * 快速排序
 */

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 7, 8, 1, 2, 5, 6, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 快速排序
     *
     *
     * @param arr
     * @param start
     * @param end
     */
    public static void quickSort(int[] arr, int start, int end){
        if (start < end) {
            // 把数组中第0个数字作为标准数
            int stard = arr[start];
            // 定义两个坐标，低位下标和高位下标
            int low = start;
            int high = end;
            // 循环找比标准数大的数和比标准数小的数
            while (low < high) {

                // 如果标准数小于右侧的数，则将高位下标向前移一位
                while (low < high && stard <= arr[high]) {
                    high--;
                }
                // 如果标准数大于右侧的数字，则使用右侧的数字替换掉左侧的数字
                arr[low] = arr[high];

                // 如果标准数大于左侧的数字，则将低位下标向后移动一位
                while (low < high && arr[low] <= stard) {
                    low++;
                }
                // 如果标准数小于左侧数字，则使用左侧的数字替换掉右侧的数字
                arr[high] = arr[low];
            }

            // 把标准数赋给低位下标所在未知的元素
            arr[low] = stard;
            // 处理所有小的数字
            quickSort(arr, start, low);
            // 处理所有大的数字
            quickSort(arr, low + 1, end);
        }
    }
}
