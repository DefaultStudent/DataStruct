package sort;

import java.util.Arrays;

/**
 * @author simon
 *
 * 实现希尔排序,比直接插入排序效率更高
 */

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 9, 4, 6, 7, 8, 2, 4, 0, 6};
        System.out.println(Arrays.toString(arr));
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        int k = 1;
        // 遍历所有的步长
        for (int d = arr.length / 2; d > 0; d /= 2){

            // 遍历所有的元素
            for (int i = d; i < arr.length; i++) {

                // 遍历本组中的所有元素
                for (int j = i - d; j >= 0; j -= d) {
                    // 进行比较 若当前元素大于加上步长后的那个元素
                    if (arr[j] > arr[j + d]) {
                        int temp = arr[j];
                        arr[j] = arr[j + d];
                        arr[j + d] = temp;
                    }
                }
            }
            System.out.println("第" + k + "次排序结果" + Arrays.toString(arr));
            k++;
        }
    }
}
