package LeetCode.Array.medium;

import Utils.Utils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {

   public static void main(String[] args) {
      int[][] intervals = Utils.read2DArray();
      int[][] result = merge(intervals);
   }

   public static int[][] merge(int[][] intervals) {
      Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
      LinkedList<int[]> merged = new LinkedList<>();
      for (int[] interval : intervals) {
         // if the list of merged intervals is empty or if the current
         // interval does not overlap with the previous, simply append it.
         if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
            merged.add(interval);
         }
         // otherwise, there is overlap, so we merge the current and previous
         // intervals.
         else {
            merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
         }
      }
      return merged.toArray(new int[merged.size()][]);
   }

   public static int[][] sort(int[][] intervals, int left, int right) {
      if (left < right) {
         int p = partition(intervals, left, right);
         sort(intervals, left, p - 1);
         sort(intervals, p + 1, right);
      }
      return intervals;
   }

   public static int partition(int[][] intervals, int i, int j) {
      int[] pivot = intervals[i];
      int[] left = intervals[i];
      int[] right = intervals[j];
      while (left[0] < pivot[0]){
         i++;
         left = intervals[i];
      }
      while (right[0] > pivot[0]) {
         j--;
         right = intervals[j];
      }
      intervals[i] = right;
      intervals[j] = left;
      return i;
   }
}
