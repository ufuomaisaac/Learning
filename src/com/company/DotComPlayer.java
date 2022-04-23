package com.company;

public class DotComPlayer {
    public static void main(String[] args){
        int[] nums = new int[5];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 1;
        nums[3] = 5;
        nums[4] = 4;

        int k = 2;

        System.out.println(countKDifference(nums, k));

    }
    public  static int countKDifference(int[] nums, int k) {
        int pairs = 0;
        for (int i = 1; i < nums.length; i++){
            for (int j = 0; j < i; j++){
                if (nums[i] - nums[j] == k || nums[i] - nums[j] == -k){
                    pairs++;
                }
            }
        }
           return pairs;
    }
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for (int i = 1; i < nums.length; i++){
            for (int j = 0; j < i; j++){
                if(nums[i] == nums[j]){
                    goodPairs++;
                }

            }
        }
        return goodPairs;

    }
}
