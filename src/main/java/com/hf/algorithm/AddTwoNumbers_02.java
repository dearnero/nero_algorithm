package com.hf.algorithm;

import com.hf.algorithm.base.ListNode;

/**
 * https://leetcode.cn/problems/add-two-numbers/
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 */
public class AddTwoNumbers_02 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        // 781 + 32
        // 1 8 7
        // 2 3
        while (l1 != null || l2 != null || carry != 0){
            int x1 = l1 == null ? 0 : l1.val;
            int x2 = l2 == null ? 0 : l2.val;
            int sum = x1 + x2 + carry;
            if (sum >= 10){
                sum = sum / 10;
                carry = 1;
            }else {
                carry = 0;
            }
            cur.next = new ListNode(sum);
            cur = cur.next;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        return pre.next;
    }

    public static void main(String[] args) {
        System.out.printf(10 % 10 + "");
    }
}
