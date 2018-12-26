package teststack;

/**
 * @author Simon
 * @date 2018.12.08
 *
 * 测试栈的操作
 */
public class TestMyStack {

    public static void main(String[] args) {
        // 创建一个栈
        MyStack myStack = new MyStack();

        // 压入数据
        myStack.push(9);
        myStack.push(8);
        myStack.push(7);

        // 查看栈顶元素
        System.out.println(myStack.peek());
        // 取出栈顶元素
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        // 查看是否为空
        System.out.println(myStack.isEmpty());
    }
}
