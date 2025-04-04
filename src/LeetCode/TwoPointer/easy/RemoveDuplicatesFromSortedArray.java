package LeetCode.TwoPointer.easy;

import static Utils.Utils.convert;
import static Utils.Utils.readInput;

public class RemoveDuplicatesFromSortedArray {

   public static void main(String[] args) {
      Integer[] input = readInput();
      int[] arr = convert(input);
      System.out.println(removeDuplicates(arr));
   }

   public static int removeDuplicates(int[] nums) {
      if (nums.length == 0) return 0;
      int i = 1;
      int insertIndex = 1;
      while (i < nums.length) {
         if (nums[i] != nums[i - 1]) {
            nums[insertIndex] = nums[i];
            insertIndex++;
         }
         i++;
      }
      return insertIndex;
   }
}
