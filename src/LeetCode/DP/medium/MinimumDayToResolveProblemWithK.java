package LeetCode.DP.medium;

import java.util.Map;

public class MinimumDayToResolveProblemWithK {

   public static void main(String[] args) {
      int[] arr = new int[]{1, 3, 6};
      System.out.println(solution(arr, 4));
   }

   public static int solution(int[] arr, int k) {
      int[] dp = new int[arr.length];
      if (arr.length == 1) {
         return 1;
      }
      dp[0] = 1;
      int max = arr[0];
      int min = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (Math.abs(arr[i] - max) > k || Math.abs(arr[i] - min) > k) {
            dp[i] = 1 + dp[i - 1];
            max = arr[i];
            min = arr[i];
         } else {
            dp[i] = dp[i - 1];
         }
         max = Math.max(max, arr[i]);
         min = Math.min(min, arr[i]);
      }
      return dp[arr.length - 1];
   }
}
