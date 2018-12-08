package demo;

/**
 * @author Simon
 * @date 2018.12.08
 *
 * 线性查找，如果数组中有重复元素，则只返回第一所在的下标
 */

public class TestSearch {

    public static void main(String[] args) {
        // 目标数组
        int[] arr = new int[] {2, 3, 4, 6, 8, 4, 9, 0};
        // 目标元素
        int target = 10;
        // 目标元素所在下标
        int index = -1;

        // 遍历数组
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        // 打印目标元素的下标
        System.out.println("index : " + index );
    }
}
