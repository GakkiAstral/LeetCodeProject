/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class LeetCode9 {
    public static void main(String[] args) {
        int x = 101;
        if (isPalindrome(x)) {
            System.out.println(x + "是回文数");
        } else {
            System.out.println(x + "不是回文数");
        }
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            String oldS = "" + x;
            String newS = new StringBuilder("" + x).reverse().toString();

            return newS.equals(oldS);
        }
    }
}
/*
思路:
1、判断是否是回文数，直接判断当前数和翻转后的数是不是一样的即可。
2、整数无法翻转，StringBuilder的reverse函数翻转效果针对字符串，所以现需要把整数转化为字符串。*/
