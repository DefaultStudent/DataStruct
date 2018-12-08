package demo1;

/**
 * @author Simon
 * @date 2018.12.08
 *
 * 栈
 */
public class MyStack {

    /**
     * 栈的底层，使用数组存储数据
     */
    int[] elements;

    public MyStack() {
        elements = new int[0];
    }

    /**
     * 压入元素
     */
    public void push(int element) {
        // 创建一个新的数组
        int[] newArr = new int[elements.length + 1];
        // 把原数组中的数据复制到新数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        // 把新的元素放入到新的数组中
        newArr[elements.length] = element;
        // 使用新数组替换旧数组
        elements = newArr;
    }

    /**
     * 取出栈顶元素
     */
    public int pop() {
        // 栈中没有元素
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }

        // 取出数组中最后一个元素
        int element = elements[elements.length - 1];
        // 创建一个新的数组
        int[] newArr = new int[elements.length - 1];
        // 原数组中除了最后一个元素的其他元素都放到新数组中
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }
        // 替换数组
        elements = newArr;

        // 返回栈顶元素
        return element;
    }

    /**
     * 查看栈顶元素
     */
    public int peek() {
        // 栈中没有元素
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length - 1];
    }

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
