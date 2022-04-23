package com.company;

public class data {
    public static void main(String[] args){
        int[] nums = {3,24,12,2,14,7,13,16,9,1,10};
        int[] newNums = quickSort(nums);
        for (int i : newNums){
            System.out.print(i + " ");
        }
    }
    public static int[] quickSort(int[] nums){
        int nsize = nums.length - 1;
        int i = -1;
        int pivot =nums[nsize];
        int temp = 0;
        for (int j = 0; j < nums.length; j++){
            if (nums[j] < pivot){
                i++;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } if (j == nums.length - 2){
                nums[nsize] = nums[i + 1];
                nums[i + 1] = pivot;
            }
        }
        return nums;
    }

}
