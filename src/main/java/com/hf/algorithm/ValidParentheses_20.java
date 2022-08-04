package com.hf.algorithm;

import java.util.*;

/**
 * https://leetcode.cn/problems/valid-parentheses/
 * <p>
 * date : 2022/7/31
 * time : 16:47
 * </p>
 * @author huangfu
 */
public class ValidParentheses_20 {

    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }
        Deque<Character> leftDeque = new ArrayDeque<>();
        Map<Character, Character> tempMap = new HashMap<Character, Character>() {{
            put(']','[');
            put('}','{');
            put(')','(');
        }};
        for (Character mChar: s.toCharArray()){
            if (mChar.toString().equals("(") || mChar.toString().equals("[") || mChar.toString().equals("{")){
                leftDeque.push(mChar);
                continue;
            }
            if (leftDeque.isEmpty() || leftDeque.peek()!=tempMap.get(mChar)){
                return false;
            }
            leftDeque.pop();
        }
        return leftDeque.isEmpty();
    }

    public static void main(String[] args) {
        new ValidParentheses_20().isValid("([)]");
    }

}
