package LeetCode.DP.easy;

import Utils.Utils;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfArray {

   public static void main(String[] args) {
      Integer[] input = Utils.readInput();
      int[] arr = Utils.convert(input);
      System.out.println(findShortestSubArray(arr));
   }

   public static int findShortestSubArray(int[] nums) {
      Map<Integer, Integer> left = new HashMap<>();
      Map<Integer, Integer> count = new HashMap<>();
      int maxDegree = 0;
      int result = Integer.MAX_VALUE;
      for (int i = 0; i < nums.length; i++) {
         if (!left.containsKey(nums[i])){
            left.put(nums[i], i);
         }
         count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
         int currentDegree = count.get(nums[i]);
         if (currentDegree > maxDegree){
            maxDegree = currentDegree;
            result = i - left.get(nums[i]) + 1;
         }else if (currentDegree == maxDegree){
            result = Math.min(result, i - left.get(nums[i]) + 1);
         }
      }
      return result;
   }

}
