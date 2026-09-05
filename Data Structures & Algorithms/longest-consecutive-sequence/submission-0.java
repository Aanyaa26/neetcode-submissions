class Solution {
    public int longestConsecutive(int[] nums) {
        int count =1;
        int ans = 1;
        
        Arrays.sort(nums);
        
        // using two pointer traverse the whole array
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i])continue;
            if(nums[i-1]==nums[i]-1){
                count++;
            }
            else{
                count =1;
            }
            ans= Math.max(count, ans);
        }
        return ans;
    }
}
