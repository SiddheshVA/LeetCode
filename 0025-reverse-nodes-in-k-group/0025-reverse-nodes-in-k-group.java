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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head==null || k==1)
        {
            return head;
        }


       ListNode dummy = new ListNode(0);
       dummy.next = head;

       ListNode prevG = dummy;

       while (true)
       {
        
        ListNode Kth = prevG;
        for(int i = 0;i<k && Kth!=null;i++)
        {
            Kth = Kth.next;
        }

        if(Kth==null)
        {
            break;
        }
             
        ListNode nextG = Kth.next;
        ListNode curr = prevG.next;
        ListNode prev = nextG;
        
        while(curr!=nextG)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
      ListNode temp = prevG.next;

      prevG.next = Kth;
      prevG = temp;

       }
return dummy.next;      
    }
}