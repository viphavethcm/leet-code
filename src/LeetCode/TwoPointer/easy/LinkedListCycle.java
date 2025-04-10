package LeetCode.TwoPointer.easy;

import Utils.ListNode;

public class LinkedListCycle {

   public static void main(String[] args) {
      ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));
      System.out.println(hasCycle(l1));
   }

   public static boolean hasCycle(ListNode head) {
      if (head == null)
         return false;

      ListNode slow = head;
      ListNode fast = head;

      while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;
         if (slow == fast) return true;
      }
      return false;
   }

}
