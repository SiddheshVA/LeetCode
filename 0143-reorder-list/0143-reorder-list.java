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

        while(curr != null)
        {
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {

        if(head==null || head.next==null)
        {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        

        ListNode secondHalf = reverse(slow.next);

        slow.next = null;

        ListNode curr = head;

        while(secondHalf!=null)
        {
            ListNode temp1 = curr.next;
            ListNode temp2 = secondHalf.next;


            curr.next = secondHalf; 
            secondHalf.next = temp1;

            curr = temp1;
            secondHalf = temp2;
        }    
    }
}

