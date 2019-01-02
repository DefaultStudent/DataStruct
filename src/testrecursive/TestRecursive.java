package testrecursive;

/**
 * @author Simon
 *
 * 测试递归
 */

public class TestRecursive {

    public static void main(String[] args) {
        print(10);
    }

    /**
     * 递归
     * @param i
     */
    public static void print(int i) {
        if (i > 0) {
            System.out.println(i);
            print(i - 1);
        }
    }
}
