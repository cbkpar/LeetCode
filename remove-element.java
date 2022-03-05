class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt = 0;
        int sz = nums.length;
        for (int i = 0; i < sz; i++) {
            if (nums[i] == val) continue;
            nums[cnt++] = nums[i];
        }
        return cnt;
    }
}
