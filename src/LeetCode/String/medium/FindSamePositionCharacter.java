package LeetCode.String.medium;

import java.util.HashMap;
import java.util.Map;

public class FindSamePositionCharacter {

   public static void main(String[] args) {
      String[] strs = new String[]{"gr", "sd", "rg"};
      int[] res = solution((strs));
      System.out.println(res);
   }

   public static int[] solution(String[] strs) {
      Map<Integer, Map<Character, Integer>> map = new HashMap<>();
      int[] res = new int[3];
      int maxLen = strs[0].length();
      int currentLen = 0;
      while (currentLen < maxLen) {
         for (int i = 0; i < strs.length; i++) {
            char c = strs[i].charAt(currentLen);
            if (!map.containsKey(currentLen)) {
               Map<Character, Integer> checking = new HashMap<>();
               checking.put(c, i);
               map.put(currentLen, checking);
            }else {
               Map<Character, Integer> checking = map.get(currentLen);
               if (checking.containsKey(c)) {
                  res[0] = checking.get(c);
                  res[1] = i;
                  res[2] = currentLen;
                  return res;
               }
               checking.put(c, i);
               map.put(currentLen, checking);
            }
         }
         currentLen++;
      }
      return new int[0];
   }
}
