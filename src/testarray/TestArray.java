package testarray;

/**
 * @author Simon
 * @date 2018.12.08
 *
 * 数组的基本操作
 */

public class TestArray {
    public static void main(String[] args) {
        //  创建数组
        int[] arr1 = new int[3];
        // 获取数组长度
        int length1 = arr1.length;
        System.out.println("arr1's length : " + length1);

        // 访问数组中的元素
        int element0 = arr1[0];
        System.out.println("element0 : " + element0);

        // 为数组中的元素赋值
        arr1[0] = 99;
        arr1[1] = 98;
        arr1[2] = 97;

        // 遍历数组
        for (int  i = 0; i < arr1.length; i++) {
            System.out.println("arr1 element" + i + " : " + arr1[i]);
        }

        // 创建数组的同时为数组赋值
        int[] arr2 = new int[] {98, 97, 96, 95};
        // 获取数组长度
        System.out.println("arr2's length : " + arr2.length);
    }
}
