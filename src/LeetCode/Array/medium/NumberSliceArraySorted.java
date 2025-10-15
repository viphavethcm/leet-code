package LeetCode.Array.medium;

public class NumberSliceArraySorted {

   public static void main(String[] args) {
      int[] arr = new int[]{2,4,1,6,5,9,7};
      System.out.println(solution(arr));
   }

   public static int solution(int[] arr) {
      int cnt = 0;
      int[] minRight = new int[arr.length];
      minRight[arr.length - 1] = arr[arr.length - 1];
      for (int i = arr.length - 2; i >= 0; i--) {
         minRight[i] = Math.min(arr[i], arr[i+1]);
      }
      int max = arr[0];
      for (int i = 1; i < arr.length - 1; i++) {
         max = Math.max(max, arr[i]);
         if (max <= minRight[i + 1]) {
            cnt++;
         }
      }
      return cnt + 1;
   }

}
