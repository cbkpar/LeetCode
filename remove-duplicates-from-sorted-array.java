class Solution {
    public int removeDuplicates(int[] nums) {
        int sz = nums.length;
        int cnt = 1;
        for (int i = 1; i < sz; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[cnt++] = nums[i];
            }
        }
        return cnt;
    }
}
