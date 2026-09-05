class Solution {
    public int help(int i, int[]nums){
        if(i==0)return nums[0];
        if(i<0)return 0;

        return Math.max(nums[i]+help(i-2,nums), help(i-1,nums));
    }
    public int rob(int[] nums) {
        return help(nums.length-1,nums);
    }
}
