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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> L1 = new LinkedList<>();
        while(true){
            L1.add(l1.val);
            if(l1.next == null) break;
            l1 = l1.next;
        }
        Queue<Integer> L2 = new LinkedList<>();
        while(true){
            L2.add(l2.val);
            if(l2.next == null) break;
            l2 = l2.next;
        }
        ListNode ans = new ListNode();
        ArrayList<Integer> arr = new ArrayList<>();
        boolean updigit = false;
        while (true) {
            int sum = updigit ? 1 : 0;
            updigit = false;
            if (!L1.isEmpty()) sum += L1.poll();
            if (!L2.isEmpty()) sum += L2.poll();
            if (sum >= 10) {
                updigit = true;
                sum -= 10;
            }
            arr.add(sum);
            if (L1.isEmpty() && L2.isEmpty()) break;
        }
        if (updigit) arr.add(1);
        int sz = arr.size();
        ListNode next = ans;
        for (int i = 0; i < sz; i++) {
            next.val = arr.get(i);
            if (i == sz - 1) break;
            next.next = new ListNode();
            next = next.next;
        }
        return ans;

    }
}
