package LeetCode.Recursion.easy;

import Utils.ListNode;

public class RemoveLinkedListElement {


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        int val = 2;
        ListNode rs = removeElements(l1, val);
        System.out.println(rs);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode rep = new ListNode(0, head);
        resolve(head, rep, val);
        return rep.next;
    }

    public static void resolve(ListNode current, ListNode prev, int val) {
        if (current == null) return;
        if (current.val == val) {
            prev.next = removeElements(current.next, val);
        }
        current.next = removeElements(current.next, val);
    }
}
