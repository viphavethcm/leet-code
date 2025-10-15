package LeetCode.String.medium;

import java.util.LinkedList;

public class PlayersMove {

   public static void main(String[] args) {
      String s = "<<^<v>>";
//      String s = "<>><<";
      System.out.println(solution(s));
   }

   public static int solution(String s) {
      int cnt = 0;
      for (int i = 0; i < s.length(); i++) {
         char current = s.charAt(i);
         if (current == '>') {
            if (i == s.length() - 1) {
               cnt++;
            }
         }
         else if (current == '<') {
            if (i == 0 || s.charAt(i - 1) == '<' || s.charAt(i - 1) == '^' || s.charAt(i - 1) == 'v') {
               cnt++;
            }
         }
         else {
            cnt++;
         }
      }
      return cnt;
   }
}
