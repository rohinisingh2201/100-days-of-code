class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = nums[0];

        //using KADANE'S ALGO
        for(int i=0; i<nums.length; i++) {
            //1
            sum += nums[i];
            //2
            maxi = Math.max(maxi, sum);
            //3
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }
}
