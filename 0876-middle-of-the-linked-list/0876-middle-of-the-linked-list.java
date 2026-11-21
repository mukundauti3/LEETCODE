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
    public ListNode middleNode(ListNode head) {
        

        ListNode slow=head;
        ListNode slow2=head;
        int count=1;

        if(slow.next==null)
            {
                return slow;
            }else if(slow.next.next==null)
            {
                return slow.next;
            }

        while(true)
        {
            

            while(slow2.next!=null)
            {
                count++;
                slow2=slow2.next;
            }


            if(count%2==0)
            {
                count=(count/2)+1;
            }else{
                count=(count/2)+1;
            }


            while(count>1)
            {
                slow=slow.next;
                count--;
            }
            return slow;
            
        }
      
    }
}