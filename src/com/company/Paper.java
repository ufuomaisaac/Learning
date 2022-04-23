package com.company;

import java.util.Scanner;

public class Paper {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int target = 6;
        int result = linearSearch(nums, target);
        System.out.println(result);
        int result1 = binarySearch(nums, target);

    }
    public static int binarySearch (int [] nums, int target){
        int leftPointer  = 0;
        int rightPointer = nums.length - 1;
        int midValue = leftPointer + (rightPointer - leftPointer)/2;
        int index = -1;
        while (leftPointer <= rightPointer) {
            if (target == nums[midValue]){
                index = midValue;
            }
            if (target < nums[midValue]) {
                rightPointer = midValue - 1;
            }
            if (target > nums[midValue]){
                leftPointer = midValue + 1;
            }
        }
        return index;
    }

    public static int linearSearch(int [] nums, int target){
        int index = -1;
        for (int j = 0; j < nums.length; j++){
            if (nums[j] == target ) {
                index = j;
            }
        }
        if (index > -1){
            return index;
        } else {
            return -1;
        }
    }

       public static int[] quicksort(int [] arr, int arrsize){
        int pivot = arr[arrsize - 1];
        int i = -1;
        int temp = 0;
        for (int j = 0; j < arr.length ; j++){
            if (arr[j] < pivot){
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            } if (j == arr.length - 2){
                arr[arrsize - 1] = arr[i + 1];
                arr[i + 1] = pivot;
            }
        }
        return arr;
       }


}



