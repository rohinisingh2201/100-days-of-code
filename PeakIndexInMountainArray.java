class Solution {
    public int PeakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                //you r in dec part of arr
                //this maybe ans but look at left
                //this is why e != mid-1
                end = mid;
            } else {
                //you are in ascen part of arr
                start = mid + 1; // bc we know mid+1 > mid
            }
        }
        //in the end START == END and points to the largest num
        return start; // or end as both are equal
    }
}
