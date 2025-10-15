package LeetCode.String.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

   public static void main(String[] args) {
      String s = "anagram", t = "nagaram";
      isAnagram(s, t);
   }

   // Sorting
//   public  static boolean isAnagram(String s, String t) {
//      if (s.length() != t.length()) return false;
//      char[] str1 = s.toCharArray();
//      char[] str2 = t.toCharArray();
//      Arrays.sort(str1);
//      Arrays.sort(str2);
//      return Arrays.equals(str1, str2);
//   }

   public static boolean isAnagram(String s, String t) {
      if (s.length() != t.length()) {
         return false;
      }
      int[] table = new int[26];
      for (int i = 0; i < s.length(); i++) {
         table[s.charAt(i) - 'a']++;
      }
      for (int i = 0; i < t.length(); i++) {
         table[t.charAt(i) - 'a']--;
         if (table[t.charAt(i) - 'a'] < 0) {
            return false;
         }
      }
      return true;
   }

   // Hash Map
//   public static boolean isAnagram(String s, String t) {
//      Map<Character, Integer> map = new HashMap<>();
//      for (Character c: s.toCharArray()) {
//         if (!map.containsKey(c)) {
//            map.putIfAbsent(c, 1);
//         }
//         else {
//            map.computeIfPresent(c, (k, v) -> v + 1);
//         }
//      }
//      for (Character c: t.toCharArray()) {
//         if (!map.containsKey(c)) {
//            return false;
//         }
//         map.computeIfPresent(c, (k, v) -> v - 1);
//         if (map.get(c) == 0) {
//            map.remove(c);
//         }
//      }
//      return map.isEmpty();
//   }
}
