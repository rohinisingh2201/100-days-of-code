package org.example;

//https://leetcode.com/problems/find-in-mountain-array/

public class SearchInMountain {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr, target));

    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        //1st half 0 to peak (asc order)
        int firstTry = orderAgBS(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        //try to search in second half (desc order)
        return orderAgBS(arr, target, peak+1, arr.length-1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
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
    static int orderAgBS(int arr[], int target, int start, int end) {

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
