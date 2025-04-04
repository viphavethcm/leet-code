package LeetCode.TwoPointer.easy;

import static Utils.Utils.convert;
import static Utils.Utils.readInput;

public class RemoveElement {

   public static void main(String[] args) {
      Integer[] input = readInput();
      int[] arr = convert(input);
      int val = 2;
      System.out.println(removeElement(arr, val));
   }

   public static int removeElement(int[] nums, int val) {
      if (nums.length == 0) return 0;
      int insertIndex = 0;
      int i = 0;
      while (i < nums.length) {
         if (nums[i] != val) {
            nums[insertIndex] = nums[i];
            insertIndex++;
         }
         i++;
      }
      return insertIndex;
   }
}
