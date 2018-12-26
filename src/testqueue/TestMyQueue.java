package testqueue;

/**
 * @author Simon
 * @date 2018.12.09
 *
 * 测试队列操作
 */

public class TestMyQueue {

    public static void main(String[] args) {
        // 创建队列
        MyQueue myQueue = new MyQueue();

        // 入队
        myQueue.add(9);
        myQueue.add(8);
        myQueue.add(7);

        // 出队,即使中间入队也并不会影响出队
        System.out.println(myQueue.poll());
        myQueue.add(6);
        System.out.println(myQueue.poll());
    }
}
