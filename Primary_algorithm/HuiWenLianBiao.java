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

       public boolean isPalindrome(ListNode head) {
        // 排除一个节点的
        if (head.next == null) {
            return true;
        }
        // 四个指针
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = head;
        ListNode prepre = null;
        // 移动四个指针
        while (fast != null && fast.next != null) { 
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
            pre.next = prepre;
            prepre = pre;
        }
        // 判断slow指针是否居中
        if (fast != null) {
            slow = slow.next;
        }
        // 最后结果判断
        while (pre != null && slow != null) {
            if (pre.val != slow.val){
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }

/*
 总结：该题使用fast.next.next和slow.next 快指针和慢指针两个运用的着实巧妙
 踩到的坑：1、移动四个指针while的循环条件必须满足fast不能为空，并且fast.next也不能为空，逻辑关系是与
 如果是用或，前面为真，但是后面为假，我们要做的是不管满足那一种条件都要退出，但是因为使用的“或”所以退出不了
 2、判断slow指针是否居中，若fast.next == null 就说明slow指针还是居中的。
 但是如果fast是在while循环以fast == null 跳出来的，那么fast.next就会报错
 3、pre != null && slow != null 和 pre.next != null && slow.next != null的区别既是前者会比较最后一个节点，而后者是不会比较最后一个节点。
*/

}