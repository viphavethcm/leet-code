package LeetCode.BackTrack.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

   public static void main(String[] args) {
      int turnedOn = 1;
      List<String> res = readBinaryWatch(turnedOn);
      for (String s: res){
         System.out.println(s);
      }
   }

   public static List<String> readBinaryWatch(int turnedOn) {
      List<String> res = new ArrayList<>();
      backTrack(0, turnedOn, new ArrayList<>(), res);
      return res;
   }

   public static void backTrack(int start, int turnedOn, List<Integer> paths, List<String> res) {
      if (paths.size() == turnedOn) {
         int hour = 0;
         int minute = 0;
         for (int bit : paths) {
            if (bit < 4) {
               hour += 1 << bit;
            } else {
               minute += 1 << (bit - 4);
            }
         }
         if (hour < 12 && minute < 60) {
            res.add(String.format("%d:%02d", hour, minute));
         }
         return;
      }
      for (int i = start; i < 10; i++) {
         paths.add(i);
         backTrack(i + 1, turnedOn, paths, res);
         paths.remove(paths.size() - 1);
      }
   }
}
