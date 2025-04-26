package LeetCode.DP.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      List<List<Integer>> res = generate(n);
      System.out.println(res);
   }

   public static List<List<Integer>> generate(int numRows) {
      List<List<Integer>> res = new ArrayList<>();
      if (numRows == 1){
         res.add(Arrays.asList(1));
         return res;
      }
      res.add(Arrays.asList(1));
      res.add(Arrays.asList(1, 1));
      for (int i = 2; i < numRows; i++) {
         List<Integer> row = new ArrayList<>();
         for (int j = 0; j <= i; j++) {
            if (j == 0 || j == i)
               row.add(1);
            else
               row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
         }
         res.add(row);
      }
      return res;
   }
}
