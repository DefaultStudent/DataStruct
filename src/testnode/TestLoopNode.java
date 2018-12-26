package testnode;

/**
 * @author Simon
 * @date 2018.12.26
 *
 * 一个节点
 */

public class TestLoopNode {
    public static void main(String[] args) {

        LoopNode loopNode1 = new LoopNode(1);
        LoopNode loopNode2 = new LoopNode(2);
        LoopNode loopNode3 = new LoopNode(3);
        LoopNode loopNode4 = new LoopNode(4);

        // 增加节点
        loopNode1.after(loopNode2);
        loopNode2.after(loopNode3);
        loopNode3.after(loopNode4);

        System.out.println(loopNode1.next.getData());
        System.out.println(loopNode2.next.getData());
        System.out.println(loopNode3.next.getData());
        System.out.println(loopNode4.next.getData());
    }
}
