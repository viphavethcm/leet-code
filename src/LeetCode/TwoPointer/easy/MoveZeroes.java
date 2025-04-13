package LeetCode.TwoPointer.easy;

import static Utils.Utils.convert;
import static Utils.Utils.readInput;

import java.util.Arrays;

public class MoveZeroes {

   public static void main(String[] args) {
      Integer[] input = readInput();
      int[] arr = convert(input);
      moveZeroes(arr);
   }

   public static void moveZeroes(int[] nums) {
      int writer = 0;
      for (int reader = 0; reader < nums.length; reader++) {
         if (nums[reader] != 0) {
            nums[writer] = nums[reader];
            writer++;
         }
      }
      while (writer < nums.length) {
         nums[writer] = 0;
         writer++;
      }
      System.out.println(Arrays.toString(nums));
   }

   //C1
//   public static void moveZeroes(int[] nums) {
//      int left = 0;
//      int right = left + 1;
//      while (left < right && right < nums.length) {
//         if (nums[left] == 0 && nums[right] != 0) {
//            nums[left] = nums[right];
//            nums[right] = 0;
//         }
//         else if (nums[left] == 0 && nums[right] == 0) {
//            right++;
//            continue;
//         }
//         left++;
//         right++;
//      }
//      System.out.println(Arrays.toString(nums));
//   }

}
