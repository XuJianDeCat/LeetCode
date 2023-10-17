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
    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = null; // 移动指针
        int cro = 0; // 进位
        ListNode head = new ListNode();
        p = head;
        do {
            int res = l1.val + l2.val + cro;
            ListNode tempNode = new ListNode(res % 10, null);
            p.next = tempNode;
            p = tempNode;
            cro = res / 10;
            l1 = l1.next;
            l2 = l2.next;
        } while (l1 != null && l2 != null);
        ListNode b = p;
        if (l1 != null) {
            p.next = l1;
            p = l1;

            do {
                if (cro == 0) {
                    break;
                }
                int res = p.val + cro;
                p.val = res % 10;
                cro = res / 10;
                p = p.next;
                b = b.next;

            } while (p != null);
            
            if (cro == 1) {
                b.next = new ListNode(cro, null);
            }
            
            return head.next;
        } else if (l2 != null) {
            p.next = l2;
            p = l2;
            
            do {
                if (cro == 0) {
                    break;
                }
                int res = p.val + cro;
                p.val = res % 10;
                cro = res / 10;
                p = p.next;
                b = b.next;

            } while (p != null);
            
            if (cro == 1) {
                b.next = new ListNode(cro, null);
            }
            
            return head.next;
        } else {
            if (cro == 1) {
                b.next = new ListNode(cro, null);
            }
            return head.next;
        }
        
    }
}
