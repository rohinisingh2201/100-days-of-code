class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;

        int[] output_arr = new int[N];

        output_arr[0] = 1;

        //calculate from left side
        for(int i=1; i<N; i++) {
            output_arr[i] = nums[i-1] * output_arr[i-1];
        }

        int R = 1; //variable to keep track from right side
        for(int i=N-1; i>=0; i--) {
            output_arr[i] = output_arr[i] * R; //multiply both together simultaneously
            R = R * nums[i];
        }

        return output_arr;
    }
}
