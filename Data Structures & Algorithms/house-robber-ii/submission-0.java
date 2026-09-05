class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0]; 

        return Math.max(robHelper(nums, 0, n - 2), robHelper(nums, 1, n - 1));
    }

    private int robHelper(int[] nums, int start, int end) {
        if (start > end) return 0; 

        return Math.max(nums[start] + robHelper(nums, start + 2, end),robHelper(nums, start + 1, end));
    }
}
