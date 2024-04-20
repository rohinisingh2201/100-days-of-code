class Solution {
    public boolean canJump(int[] nums) {
        int lastIndexGoodPosition = nums.length-1;
        //looping backwards & checking one by one
        for(int i = nums.length-1; i >= 0; i--) {
            if(i + nums[i] >= lastIndexGoodPosition) {
                lastIndexGoodPosition = i;
            }
        }
        return lastIndexGoodPosition == 0;
    }
}
