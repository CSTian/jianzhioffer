package day3;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 */


public class FindKthToTail {
        public ListNode FindKthToTail(ListNode head, int k) {
            Map<Object, ListNode> map = new HashMap<Object, ListNode>();
            int i = 1;
            while (head != null){
                map.put(i,head);
                i ++;
                head = head.next;
            }
            return map.get(i - k);
        }
    }
