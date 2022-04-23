import java.util.*;
import java.util.jar.JarOutputStream;

public class copy {
    public static void main (String[] args){
        int[] nums = { 3, 4, 7};
        int val = 2;
        int result = searchInsert1(nums, val);
        System.out.println(result);

    }

    public static int removeElement(int[] nums, int val) {
        int i = -1;
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != val){
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
    public static int searchInsert1(int [] nums, int target) {
        int l_pointer = 0;
        int r_pointer = nums.length - 1;
        int midValue;
        while (l_pointer <= r_pointer){
            midValue = l_pointer + (r_pointer - l_pointer)/2;
            if (nums[midValue] == target){
                return midValue;
            } else if (target > nums[midValue]){
                r_pointer = midValue + 1;
            } else {
                r_pointer = midValue - 1;
            }
        }
        return l_pointer;
    }
}


