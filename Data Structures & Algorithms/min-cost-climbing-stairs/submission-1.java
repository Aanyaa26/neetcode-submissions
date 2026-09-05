class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n =cost.length;
        int [] dp = new int [n+1];
        return Math.min(mincost(cost,n,0,dp),mincost(cost,n,1,dp));
    }
    public int mincost(int[] cost, int n, int i,int [] dp){
        if(i>=n)return 0;
        if(dp[i]!=0)return dp[i];

        dp[i]= cost[i]+Math.min(mincost(cost,n,i+1,dp),mincost(cost,n,i+2,dp));
        return dp[i];
    }
}
