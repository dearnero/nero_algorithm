package com.hf.algorithm;

/**
 * https://leetcode.cn/problems/palindrome-number/
 * <p>
 * date : 2022/7/31
 * time : 16:47
 * </p>
 * @author huangfu
 */
public class IsPalindrome_09 {

    public static void main(String[] args) {
        new IsPalindrome_09().isPalindrome_int(121);
    }

    /**
     * 借助java字符串
     */
    public boolean isPalindrome_str(int x) {
        String xStr = x + "";
        String revStr = new StringBuffer(xStr).reverse().toString();
        return xStr.equals(revStr);
    }

    /**
     * 反转一半数字
     * 时间复杂度：O(n)
     */
    public boolean isPalindrome_int(int x) {
        if (x < 0 || x % 10 == 0 && x != 0){
            return false;
        }
        int temp = 0;
        while (x > temp){
            temp = temp * 10 + (x % 10);
            x = x / 10;
        }
        return temp == x || x == temp / 10;
    }
}
