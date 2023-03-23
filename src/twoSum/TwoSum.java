package twoSum;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 11};

        System.out.println(Arrays.toString(twoSum(nums, 10)));
    }


    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


}
