class Solution {
    public int help(int i, int[]nums,int[] memo){
        if(i==0)return nums[0];
        if(i<0)return 0;
        if(memo[i]!=-1)return memo[i];

        memo[nums.length] = Math.max(nums[i]+help(i-2,nums,memo), help(i-1,nums,memo));
        return memo[nums.length];
    }
    public int rob(int[] nums) {
        int [] memo = new int [nums.length+1];
        Arrays.fill(memo,-1);
        return help(nums.length-1,nums,memo);
    }
}
