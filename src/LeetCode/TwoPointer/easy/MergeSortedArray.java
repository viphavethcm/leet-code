package LeetCode.TwoPointer.easy;

import static Utils.Utils.readInputList;

import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {

   public static void main(String[] args) {
      List<int[]> arrays = readInputList();
      int m = 0, n = 1;
      merge(arrays.get(0), m, arrays.get(1),  n);
   }
   // [1,2,3,0,0,0] [2,5,6]
   public static void merge(int[] nums1, int m, int[] nums2, int n) {
      int p1 = m - 1;
      int p2 = n - 1;
      int p = m + n - 1;
      while(p >= 0) {
         if (p2 < 0) break;
         if (p1 >= 0 && nums1[p1] > nums2[p2]) {
            nums1[p--] = nums1[p1--];
         }
         else {
            nums1[p--] = nums2[p2--];
         }
      }
   }
}
