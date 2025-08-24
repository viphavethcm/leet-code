package LeetCode.Array.easy;

import static Utils.Utils.convert;
import static Utils.Utils.readInput;

public class MajorityElement {

   public static void main(String[] args) {
      int[] nums = convert(readInput());
      System.out.println(majorityElement(nums));
   }

   public static int majorityElement(int[] nums) {
      int candidate = 0;
      int cnt = 0;
      for (int i = 0;i < nums.length; i++) {
         if (cnt == 0) {
            candidate = nums[i];
            cnt++;
         }
         else {
            cnt += (candidate == nums[i]) ? 1 : -1;
         }
      }
      return candidate;
   }
}
