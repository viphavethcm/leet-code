package LeetCode.String.easy;

import static Utils.Utils.convert;
import static Utils.Utils.readInput;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int target = sc.nextInt();
      Integer[] input = readInput();
      int[] arr1 = convert(input);
      int[] result = twoSum(arr1, target);
      for (int i = 0; i < result.length; i++) {
         System.out.println(result[i]);
      }
   }

   public static int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
         if (map.containsKey(nums[i])) {
            return new int[] { map.get(nums[i]), i };
         }
         map.put(target - nums[i], i);
      }
      return new int[] {};
   }
}
