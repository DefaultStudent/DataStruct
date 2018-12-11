package demo3;

/**
 * @author Simon
 * @date 2018.12.11
 *
 * 一个节点
 */
public class Node {

    /**
     * 节点内容
      */
    int data;

    /**
     * 下一个节点
     */
    Node next;

    public Node(int data) {
        this.data = data;
    }

    /**
     * 为节点追回节点
     */
    public Node append(Node node) {
        // 当前节点
        Node currentNode = this;
        // 循环向后找
        while (true) {
            // 取出下一个节点
            Node nextNode = currentNode.next;
            // 如果下一个节点为null
            if (nextNode == null) {
                break;
            }
            // 赋给当前节点
            currentNode = nextNode;
        }
        // 把需要追回的节点追加为找到当前节点的下一个节点
        currentNode.next = node;
        return this;
    }

    /**
     * 获取下一个节点
     */
    public Node next() {
        return this.next;
    }

    /**
     * 获取节点中的数据
     */
    public int getData() {
        return this.data;
    }

    /**
     * 当前节点是否为最后一个节点
     */
    public boolean isLast() {
        return next == null;
    }
}
