package LeetCode.DP;

import java.util.Scanner;

public class ClimbingStairs {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.println(climbStairs(n));
   }

   public static int climbStairs(int n) {
      if (n == 1)
         return 1;
      int[] dp = new int[n+1];
      dp[1] = 1;
      dp[2] = 2;
      for (int i = 3; i <= n; i++) {
         dp[n] = dp[i-1] + dp[i-2];
      }
      return dp[n];
   }

//  Cách 1: Đệ quy và lưu vào memory
//   public static int climbStairs(int n) {
//      int memo[] = new int[n + 1];
//      return climbStairs(0, n, memo);
//   }
//
//   public static int climbStairs(int current, int step, int memo[]) {
//      if (current > step) {
//         return 0;
//      }
//      if (current == step) {
//         return 1;
//      }
//      memo[current] =  climbStairs(current + 1, step, memo) + climbStairs(current + 2, step, memo);
//      return memo[current];
//   }
}
