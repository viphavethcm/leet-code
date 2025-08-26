package LeetCode.String.easy;

import static Utils.Utils.read2DArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindMissingRepeatedValues {

   public static void main(String[] args) {
      int[][] nums = read2DArray();
      int[] rs = findMissingAndRepeatedValues(nums);
      for (int i = 0; i < rs.length; i++) {
         System.out.println(rs[i]);
      }
   }
   public static int[] findMissingAndRepeatedValues(int[][] grid) {
      int len = grid.length;
      int repeated = 0;
      int missing = 0;
      Set<Integer> set = new HashSet<>();
      for (int i = 0; i < len; i++) {
         for (int j = 0; j < len; j++) {
            if(set.contains(grid[i][j])){
               repeated = grid[i][j];
               continue;
            }
            set.add(grid[i][j]);
         }
      }
      for (int i = 1; i <= len*len; i++) {
         if (!set.contains(i)){
            missing = i;
            break;
         }
      }
      return new int[]{repeated, missing};
   }
}

