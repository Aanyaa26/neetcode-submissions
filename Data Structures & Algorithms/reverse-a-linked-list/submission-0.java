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
    public ListNode reverseList(ListNode head) {
        // will initialise all our pointers
        ListNode current = head; // the starting point
        ListNode previous = null; // will help us to store passing by elements which will be pointed
        ListNode next = null; // temp variable to store the links thus ensure the link is not lost in changing the pointer of current ot previous

        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            
        }
        return previous;
    }
}
