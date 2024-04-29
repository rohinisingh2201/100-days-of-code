class Solution {

    public int solve(int[] cost, int n) {
        //step1
        int dp[] = new int[n+1];
        //step2
        dp[0] = cost[0];
        dp[1] = cost[1];
        //step3
        for(int i=2; i<n; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }

        return Math.min(dp[n-1], dp[n-2]);
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return solve(cost, n);
    }
}
