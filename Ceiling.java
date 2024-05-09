package org.example;

public class Ceiling {

    //smallest num greater than equal to target
    static int ceiling(int[] arr, int target) {

        //what if target is greater than greatest num in the array
        if(target > arr[arr.length - 1]) {
            return -1;
        }
        
        int start = 0;
        int end = arr.length - 1;

//        Arrays.sort(arr);

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(target < arr[mid]) {
                end = mid-1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;  //14 16 18
                       //e   s   -  greatest num
    }


    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 15; //returns index 5 - 16
        System.out.println(ceiling(arr, target));
    }
}
