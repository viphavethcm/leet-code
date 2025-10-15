package LeetCode.String.medium;

import java.util.HashMap;
import java.util.Map;

public class ReplaceStringQuestionWithK {

   public static void main(String[] args) {
      Map<String, Integer> map = new HashMap<>();
      map.put("?ab??a", 0);
      map.put("guz?za", 1);
      map.put("?gad?bcc?dg?", 2);
      for (Map.Entry<String, Integer> entry : map.entrySet()) {
         System.out.println(solution(entry.getKey(), entry.getValue()));
      }
   }

   public static String solution(String s, int k) {
      char[] c = s.toCharArray();
      int left = 0, right = c.length - 1;
      while (left <= right) {
         if (c[left] == '?' && c[right] == '?') {
            c[left] = 'a';
            c[right] = 'a';
         }
         else if (c[left] == '?') {
            c[left] = c[right];
         }
         else if (c[right] == '?') {
            c[right] = c[left];
         }
         left++;
         right--;
      }
      left = 0; right = c.length - 1;
      while (left <= right) {
         if (c[left] != c[right]) {
            if (k <= 0) {
               return "NO";
            }
            c[left] = c[right];
            k--;
         }
         left++;
         right--;
      }
      return new String(c);
   }
}
