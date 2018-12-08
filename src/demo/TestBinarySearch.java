package demo;

/**
 * @author Simon
 * @date 2018.12.08
 *
 * 二分查找法 数组数据必须有序
 */

public class TestBinarySearch {

    public static void main(String[] args) {
        // 目标数组
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 目标元素
        int target = 8;
        // 记录开始位置
        int begin = 0;
        // 记录结束位置
        int end = arr.length - 1;
        // 记录中间位置
        int mid = (begin + end) / 2;
        // 记录目标位置
        int index = -1;

        // 循环查找
        while (true) {

            if (begin >= end) {
                index = -1;
                break;
            }
            // 判断中间元素是否为要查找的元素
            if (arr[mid] == target) {
                index = mid;
                break;
            } else {
                // 中间元素不是要查找到元素
                // 判断中间元素是否比目标元素大
                if (arr[mid] > target) {
                    // 把结束位置调整到中间位置的前一个位置
                    end = mid - 1;
                } else {
                    // 中间元素比目标元素小
                    // 把开始位置调整到中间位置的后一个位置
                    begin = mid + 1;
                }
                // 取出新的中间位置
                mid = (begin + end) / 2;

            }
        }
        System.out.println("index : " + index);
    }
}
