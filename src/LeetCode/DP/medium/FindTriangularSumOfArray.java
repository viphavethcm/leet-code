package LeetCode.DP.medium;

import static Utils.Utils.convert;
import static Utils.Utils.readInput;

public class FindTriangularSumOfArray {

   public static void main(String[] args) {
      Integer[] input = readInput();
      int[] arr = convert(input);
      System.out.println(triangularSum(arr));
   }
   // DP nhưng ko tạo mảng mới để lưu currentNums
   public static int triangularSum(int[] nums) {
      if (nums.length == 1) return nums[0];
      int len = nums.length - 1;
      while (len >= 1) {
         for (int i = 0;i < len;i++){
            nums[i] = (nums[i] + nums[i+1]) % 10;
         }
         len--;
      }
      return nums[0];
   }
//   Cách 1: DP
//   public int triangularSum(int[] nums) {
//      if (nums.length == 1)
//         return nums[0];
//
//      while (nums.length > 1) {
//         int[] currentNums = new int[nums.length - 1];
//         for (int i = 0; i < currentNums.length; i++) {
//            currentNums[i] = (nums[i] + nums[i + 1]) % 10;
//         }
//         nums = currentNums;
//      }
//      return nums[0];
//   }
}
