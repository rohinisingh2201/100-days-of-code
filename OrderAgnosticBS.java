package org.example;
public class OrderAgnosticBS {

    public static void main(String[] args) {
        int arr[] = {-18, -12, 2, 3, 4, 15, 18, 22, 56, 89};
        int target = 22;
        System.out.println(bs(arr, target));
    }

    static int bs(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether array is sorted in asc or dsc
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if(target < arr[mid]) {
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
