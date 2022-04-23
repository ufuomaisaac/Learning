package com.company;

public class MaximumNumber {
    public static void main(String[] args){
        int[] nums = {1, 2, 4, 3, 4, 5, 5,};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        int maximumNum = -1;
        int secondMaximumNum = -1;
        int thirdMaximumNum = -1;
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        for (int i = 1; i < nums.length; i++){
            maximumNum = nums[0];
            if (nums[i] > maximumNum){
                maximumNum = nums[i];
                index1 = i;
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == maximumNum || i == index1){
                continue;
            }
            if (nums[i] > secondMaximumNum){
                secondMaximumNum = nums[i];
                index2 = i;
            }
        }
        for( int i = 0; i < nums.length; i++){
            if(nums[i] == maximumNum || nums[i] == secondMaximumNum || i == index1 || i == index2){
                continue;
            } else if ( nums[i] > thirdMaximumNum){
                maximumNum = nums[i];
            }
        }
        return maximumNum;
    }
}
