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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode();
        ListNode cur = ans;
        int[] cnt = new int[201];
        while (head != null) {
            cnt[head.val + 100]++;
            head = head.next;
        }
        for (int i = 0; i < 201; i++) {
            if (cnt[i] == 1) {
                cur = cur.next = new ListNode();
                cur.val = i - 100;
            }
        }
        return ans.next;
    }
}
