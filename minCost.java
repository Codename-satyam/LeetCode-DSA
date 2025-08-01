class minCost{
    public int helper(int n, int[] memo,int[] cost){
        if(n<=1){
            return n;
        }
        if(memo[n] != -1){
            return memo[n];
        }
        int a = helper(n-1, memo, cost) + cost[0];
        int b = helper(n-2, memo, cost) + cost[1];
        memo[n] = Math.min(a, b);
        return memo[n];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        return helper(n, memo, cost);
    }
}