class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int [2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++){
            int num = target-nums[i];
            if(map.containsKey(num) && i!=map.get(num)){
                ans[0]=i;
                ans[1]= map.get(num);
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
