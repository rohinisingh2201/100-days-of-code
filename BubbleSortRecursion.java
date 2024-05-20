package Recursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1};
        bubbleRecur(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleRecur(int[] arr, int r, int c) {
        if(r == 0) {
            return;
        }
        //c - pointer by which one by one element is sorted
        //r - length that keeps dec as per sorted array
        if(c < r) {
            if(arr[c] > arr[c+1]) {
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleRecur(arr, r, c+1);
        } else {
            bubbleRecur(arr, r-1, 0);
        }
    }
}
