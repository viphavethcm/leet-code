package LeetCode.DP.medium;

import Utils.Utils;

public class MaximumSubarray {

   public static void main(String[] args) {
      Integer[] input = Utils.readInput();
      int[] arr = Utils.convert(input);
      System.out.println(maxSubArray(arr));
   }

   // Kadane's algorithm
   public static int maxSubArray(int[] nums) {
      int maxSum = nums[0];
      int currentSum = 0;
      for (int i = 0; i < nums.length; i++) {
         if (currentSum < 0) {
            currentSum = 0;
         }
         currentSum += nums[i];
         maxSum = Math.max(maxSum, currentSum);
      }
      return maxSum;
   }

}
