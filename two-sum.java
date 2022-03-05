class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {0, 0};
        HashMap<Integer, Integer> map = new HashMap<>();
        int sz = nums.length;
        for (int i = 0; i < sz; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
