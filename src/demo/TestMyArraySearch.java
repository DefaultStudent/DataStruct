package demo;

import demo.util.MyArray;

/**
 * @author Simon
 * @date 2018.12.08
 *
 * 测试查找方法
 */

public class TestMyArraySearch {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        for (int i = 1; i < 6; i++) {
            myArray.add(i);
        }

//        // 调用线性查找方法
//        int index = myArray.search(4);
//        System.out.println("index : " + index);

        // 调用二分法查找
        int index1 = myArray.binarySearch(10);
        System.out.println("index1 : " + index1);
    }
}
