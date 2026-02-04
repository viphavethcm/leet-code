package LeetCode.Array.easy;

import static Utils.Utils.convert;
import static Utils.Utils.readInput;

/**
 * https://leetcode.com/problems/find-pivot-index/description/
 * right sum at index i = total - left sum - nums[i]
 * if left sum = right sum = i
 * */
public class FindPivotIndex {
    //1,7,3,6,5,6
    public static void main(String[] args) {
        Integer[] input = readInput();
        int[] arr = convert(input);
        System.out.println(pivotIndex(arr));;
    }
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for (int num: nums) {
            sum += num;
        }
        for (int i = 0;i < nums.length;i++) {
            int rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }
}