package com.hf.algorithm;

import java.util.HashSet;

/**
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 * <p>
 * date : 2022/8/20
 * time : 20:33
 * </p>
 * @author huangfu
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> occ = new HashSet<>();
        int size = s.length();
        int result = 0;
        int start = 0;
        for (int i = 0; i < size; i++) {
            Character x = s.charAt(i);
            if(occ.contains(x)){
                // 改变start位置
                for (int j = start; j < i; j++) {
                    if(x.equals(s.charAt(j))){
                        start = j + 1;
                        break;
                    }
                    occ.remove(s.charAt(j));
                }
            }else {
                // 添加字符
                occ.add(x);
            }
            result = Math.max(result, i - start + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("pwwkew"));

    }
}
