package day3;

/**
 * 题目描述
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 *
 * 解题思路:将list2的节点插入list1中合适的位置
 */
    public class Merge {
        public static ListNode Merge(ListNode list1, ListNode list2) {
            if(list1 == null){
                return list2;
            }
            if(list2 == null){
                return list1;
            }
            if(list1.val <= list2.val){
                list1.next = Merge(list1.next, list2);
                return list1;
            }else{
                list2.next = Merge(list1, list2.next);
                return list2;
            }
        }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(3);
        ListNode head2 = new ListNode(5);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(4);
        head.next=head1;
        head1.next=head2;

        head3.next=head4;
        Merge(head,head3);
    }
    }

