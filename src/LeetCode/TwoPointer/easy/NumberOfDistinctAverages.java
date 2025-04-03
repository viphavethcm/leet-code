package LeetCode.TwoPointer.easy;

import static Utils.Utils.convert;
import static Utils.Utils.readInput;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAverages {

   public static void main(String[] args) {
      Integer[] input = readInput();
      int[] arr = convert(input);
      System.out.println(distinctAverages(arr));
   }

   public static int distinctAverages(int[] nums) {
      if(nums.length <= 1) return 0;
      Arrays.sort(nums);
      Set<Float> rs = new HashSet<>();
      int right = nums.length - 1;
      int left = 0;
      while (left < right){
         float average = (float) (nums[left] + nums[right]) / 2;
         rs.add(average);
         ++left;
         right--;
      }
      return rs.size();
   }

}
