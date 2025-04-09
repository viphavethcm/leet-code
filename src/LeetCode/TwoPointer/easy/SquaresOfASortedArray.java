package LeetCode.TwoPointer.easy;

import static Utils.Utils.convert;
import static Utils.Utils.readInput;

import java.util.Arrays;

public class SquaresOfASortedArray {

   public static void main(String[] args) {
      Integer[] input = readInput();
      int[] arr = convert(input);
      System.out.println(Arrays.toString(sortedSquares(arr)));
   }

   public static int[] sortedSquares(int[] nums) {
      int left = 0;
      int right = nums.length - 1;
      int[] res = new int[nums.length];
      int idx = nums.length - 1;
      while (idx > 0) {
         int square;
         if (Math.abs(nums[left]) < Math.abs(nums[right])) {
            square = nums[right];
            right--;
         }else {
            square = nums[left];
            left++;
         }
         res[idx] = square * square;
         idx--;
      }
      return res;
   }
}
