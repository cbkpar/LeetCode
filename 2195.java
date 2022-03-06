class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sz = nums.length;
        long ans = 0;
        if (nums.length > 0) if (nums[0] <= k) {
            k++;
            ans -= nums[0];
        }
        for (int i = 1; i < sz; i++) {
            if (nums[i - 1] == nums[i]) continue;
            if (nums[i] <= k) {
                k++;
                ans -= nums[i];
            }
        }
        ans += ((long) k * (k + 1)) / 2;
        return ans;
    }
}
