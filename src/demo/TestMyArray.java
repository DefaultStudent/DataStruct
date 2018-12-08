package demo;

import demo.util.MyArray;

/**
 * @author Simon
 * @date 2018.12.08
 */

public class TestMyArray {

    public static void main(String[] args) {
        // 创建一个可变的数组
        MyArray myArray = new MyArray();
        // 获取长度
        int size = myArray.size();
        myArray.show();

        // 向可变数组中添加一个元素
        myArray.add(99);
        myArray.add(98);
        myArray.add(97);
        // 显示数组中所有元素到控制台
        myArray.show();

        // 删除某个元素
        myArray.delete(1);
        myArray.show();

        // 取出指定位置的元素
        int element = myArray.get(1);
        System.out.println(element);

        System.out.println("====================================");
        myArray.add(96);
        myArray.add(95);
        myArray.add(94);
        myArray.show();

        // 将元素插入到指定位置
        myArray.inset(3, 43);
        myArray.show();

        // 替换指定位置的元素
        myArray.set(0, 100);
        myArray.show();
    }
}
