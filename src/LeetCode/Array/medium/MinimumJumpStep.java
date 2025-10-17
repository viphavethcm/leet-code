package LeetCode.Array.medium;

import java.util.Arrays;

public class MinimumJumpStep {

   public static void main(String[] args) {
      System.out.println(solution(new int[]{6, 2, 3, 5, 6, 3}));
   }

   public static int solution(int[] arr) {
      long MAX = 1_000_000_000L;
      Arrays.sort(arr);
      long cnt = 0;
      for (int i = 0; i < arr.length; i++) {
         cnt += Math.abs(arr[i] - (i + 1));
         if (cnt > MAX) {
            return -1;
         }
      }

      return (int) cnt;
   }
}
