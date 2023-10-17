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
      
     // 递归
    public ListNode reverseList(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode  headNext = reverseList(head.next);
       head.next.next = head;
        head.next = null;
        return headNext;

    }
   // 总结: 写链表，将链表画在纸上。
   /*
        一个节点不但可以掌控自己还可以掌控自己后面的节点。
        利用好双指针也是一件不错的解决方法。
   */
    
}