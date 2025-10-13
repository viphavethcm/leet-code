package LeetCode.Array.medium;

import static Utils.Utils.read2DArray;

public class Search2DMatrix {

   public static void main(String[] args) {
      int[][] arr = read2DArray();
      boolean res = searchMatrix(arr, 35);
      System.out.println(res);
   }

   public static boolean searchMatrix(int[][] matrix, int target) {
      int m = matrix.length;
      for (int i = 0; i < m; i++) {
         int n = matrix[i].length;
         int left = 0;
         int right = n - 1;
         if (matrix[i][n - 1] >= target) {
            while (left <= right) {
               if (target > matrix[i][left]) {
                  left++;
               } else if (target < matrix[i][right]) {
                  right--;
               } else {
                  return true;
               }
            }
            return false;
         }
      }
      return false;
   }
}
