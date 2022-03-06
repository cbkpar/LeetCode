class Solution {
    public int deleteAndEarn(int[] nums) {
        int[][] dp = new int[10001][2];
        int[] cnt = new int[10001];
        for(int n:nums) cnt[n]++;
        for(int i=1;i<=10000;i++){
            dp[i][1] = dp[i-1][0] + cnt[i] * i;
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
        }
        return Math.max(dp[10000][0], dp[10000][1]);
    }
}
