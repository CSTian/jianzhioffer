package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
题目描述
输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

public class printListFromTailToHead {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Map<Integer,ListNode> map = new HashMap<>();
        int num = 0;
        ArrayList<Integer> result = new ArrayList();
        while(listNode != null){
            map.put(num,listNode);
            num ++;
            listNode = listNode.next;
        }
        num--;
        for (;num >= 0 ;num--){
            result.add(map.get(num).val);
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        ArrayList<Integer> list = printListFromTailToHead(listNode1);

    }
}
