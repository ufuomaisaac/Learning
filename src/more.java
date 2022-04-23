import java.util.Stack;

public class more {
    public static void main(String [] args){
        int [][] nums = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
        int target = 10;
        boolean result = search2Dmatrix(nums, target);
        System.out.println(result);
    }
    public static boolean search2Dmatrix(int [][] nums, int target ){
        boolean b = false;
        int row = nums.length;
        int column = nums[0].length;

        int left = 0;
        int right = (row * column) - 1;

        while (left <= right){
            int mid_index = left + (right - left)/2;
            int mid_value = nums[mid_index / column][mid_index % column];
            if (target == mid_value){
                b = true;
            } else if (target > mid_value){
                left = mid_index + 1;
            } else if (target < mid_value){
                right = mid_index - 1;
            }
        }
        return b;
    }
}
