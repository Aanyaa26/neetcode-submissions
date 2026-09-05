class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n =cost.length;
        return Math.min(mincost(cost,n,0),mincost(cost,n,1));
    }
    public int mincost(int[] cost, int n, int i){
        if(i>=n)return 0;

        return cost[i]+Math.min(mincost(cost,n,i+1),mincost(cost,n,i+2));
    }
}
