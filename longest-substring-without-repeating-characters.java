class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] cnt = new int[256];
        int left = 0;
        int mx = 0;
        int sz = s.length();
        for (int i = 0; i < sz; i++) {
            int num = s.charAt(i);
            cnt[num]++;
            while (cnt[num] > 1) cnt[s.charAt(left++)]--;
            mx = Math.max(mx, i - left + 1);
        }
        return mx;
    }
}
