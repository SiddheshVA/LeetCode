/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    private ListNode reverse(ListNode head)
    {
       ListNode prev = null;
       ListNode curr = head;

       while(curr!=null)
       {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
       return prev;
    }
    public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null)
        {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverse(slow.next);
        ListNode list1 = head;
        ListNode list2 = secondHalf;

        while(list2!=null)
        {
            if(list1.val!=list2.val)
            {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
      return true;
    }
}