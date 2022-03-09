/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* ans = new ListNode();
        ListNode* cur = ans;
        int cnt[201] = {0,};
        while(head) {
            cnt[head->val + 100]++;
            head = head->next;
        }
        int* ptr = cnt;
        for (int i = 0; i < 201; i++){
            if(*ptr++ == 1) {
                cur = cur->next = new ListNode();
                cur->val = i - 100;
            }
        }
        return ans->next;
    }
};
