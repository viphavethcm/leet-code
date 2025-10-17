package LeetCode.String.easy;

public class DeleteCharacterAB {

   public static void main(String[] args) {
      String s = "AABBBB";
      System.out.println(solution(s));
   }

   public static int solution(String s) {
      int cnt = 0;
      int deleteB = 0;
      int deleteA = 0;
      for (char c : s.toCharArray()) {
         if (c == 'A') {
            deleteA++;
            if (deleteB > 0) {
               cnt = Math.min(deleteA, deleteB);
            }
         } else {
            deleteB++;
         }
      }

      return cnt;
   }
}
