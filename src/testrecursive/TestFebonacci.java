package testrecursive;

/**
 * @author Simon
 *
 * 使用递归打印第n项斐波那契数列
 */

public class TestFebonacci {

    public static void main(String[] args) {
        // 斐波那契数列：1 1 2 3 5 8 13 ...；即前两项为1，从第三项开始，每一项的值都是前面两项的和
        int i = febonacci(5);
        System.out.println(i);
    }

    /**
     * 打印第n项斐波那契数列
     * @param i
     * @return
     */
    public static int febonacci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            int sum = febonacci(i - 1) + febonacci( i - 2);
            return sum;
        }
    }
}
