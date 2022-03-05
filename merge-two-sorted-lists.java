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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode next = ans;
        while (true) {
            if (list1 == null || list2 == null) break;
            if (list1.val <= list2.val) {
                next = next.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                next = next.next = new ListNode(list2.val);
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            next = next.next = new ListNode(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            next = next.next = new ListNode(list2.val);
            list2 = list2.next;
        }
        return ans.next;
    }
}
