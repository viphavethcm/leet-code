package LeetCode.Greedy.easy;

import java.util.Scanner;

public class MinimumTimeToTypeWord {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String word = sc.nextLine();
      System.out.println(minTimeToType(word));
   }

   public static int minTimeToType(String word) {
      int cnt = 0;
      int pointer = 'a';
      for (int i = 0; i < word.length(); i++) {
         int clockWise = Math.abs(pointer - word.charAt(i)); // kc giữa 2 kí tự
         int counterClockWise = 26 - clockWise;
         cnt += Math.min(clockWise, counterClockWise) + 1;
         pointer = word.charAt(i);
      }
      return cnt;
   }

}
