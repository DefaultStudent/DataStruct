package testarray;

import java.util.Arrays;

/**
 * @author Simon
 * @date 2018.12.08
 *
 * 数组的基本操作
 */

public class TestOpArray {

    public static void main(String[] args) {
//        // 解决数组长度不可变的问题
//        int[] arr = new int[] {9, 8, 7};
//        // 快速查看数组中的元素
//        System.out.println(Arrays.toString(arr));
//        // 要加入数组的目标元素
//        int dst = 6;
//
//
//        // 创建一个新数组，长度是原数组+1
//        int[] newArr = new int[arr.length + 1];
//        // 把原数组中的数据全部复制到新数组中
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i];
//        }
//        // 把目标元素放到新数组最后
//        newArr[arr.length] = dst;
//        // 新数组替换原数组
//        arr = newArr;
//        System.out.println(Arrays.toString(newArr));

        // 删除数组中的元素

        // 目标数组
        int[] arr1 = new int[] {9, 8, 7, 6, 5, 4};
        // 要删除的元素的下标
        int dst = 0;
        System.out.println(Arrays.toString(arr1));

        // 创建新的数组，长度是原数组的长度-1
        int[] newArr = new int[arr1.length - 1];
        // 复制原数组中除了要删除的那个元素以外的其他元素
        for (int i = 0; i < newArr.length; i++) {
            // 要删除的元素之前的元素
            if (i < dst){
                newArr[i] = arr1[i];
                // 要删除的元素之后的元素
            } else {
                newArr[i] = arr1[i + 1];
            }
        }
        // 新数组替换原数组
        arr1 = newArr;
        System.out.println(Arrays.toString(arr1));
    }
}
