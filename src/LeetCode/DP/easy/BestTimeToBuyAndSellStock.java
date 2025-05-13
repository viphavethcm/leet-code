package LeetCode.DP.easy;

import Utils.Utils;

public class BestTimeToBuyAndSellStock {

   public static void main(String[] args) {
      Integer[] input = Utils.readInput();
      int[] prices = Utils.convert(input);
      System.out.println(maxProfit(prices));
   }

//   public static int maxProfit(int[] prices) {
//      if (prices.length == 1)
//         return 0;
//      int max = 0;
//      for (int i = 0; i < prices.length - 1; i++) {
//         for (int j = i + 1; j < prices.length; j++) {
//            if (prices[j] > prices[i])
//               max = Math.max(max, prices[j] - prices[i]);
//            else break;
//         }
//      }
//      return max;
//   }

   public static int maxProfit(int[] prices) {
      if (prices.length == 1) return 0;
      int min = Integer.MAX_VALUE;
      int maxProfit = 0;
      for (int i = 0; i < prices.length; i++) {
         if (prices[i] < min)
            min = prices[i];
         else
            maxProfit = Math.max(maxProfit, prices[i] - min);
      }
      return maxProfit;
   }
}
