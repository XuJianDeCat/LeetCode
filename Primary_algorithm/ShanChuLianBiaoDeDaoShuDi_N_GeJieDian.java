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
public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode index1 = head, index2 = head;
        for (int i = 0; i < n; i++) {
            index2 = index2.next;
        }
        if (index2 == null) { // 说明要删除第一个节点
            return head.next;
        }
        while (index2.next != null) { // 将index2位移到最后一个节点
            index2 =  index2.next;
            index1 = index1.next;
        }
        index1.next = index1.next.next;
        return head;





}


}