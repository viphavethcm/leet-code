package LeetCode.String.easy;

public class GoodRoad {

   public static void main(String[] args) {
      String s = "XX.XXXX.";
      System.out.println(solution(s));
   }

   public static int solution(String s) {
      int cnt = 0, idx = 0;
      while (idx < s.length()) {
         if (s.charAt(idx) == 'X') {
            cnt++;
            idx += 3;
         }
         else {
            idx++;
         }
      }
      return cnt;
   }
}
