package LeetCode.TwoPointer.easy;

import java.util.Arrays;

public class MergeStringsAlternately {

   public static void main(String[] args) {
      String word1 = "abcd", word2 = "pq";
      System.out.println(mergeAlternately(word1, word2));
   }

   public static String mergeAlternately(String word1, String word2) {
      if (word1.isEmpty()){
         return word2;
      }
      if (word2.isEmpty()){
         return word1;
      }
      StringBuilder res = new StringBuilder();
      int word1Index = 0, word2Index = 0;
      while (word1Index < word1.length() || word2Index < word2.length()) {
         if (word1Index < word1.length()) {
            res.append(word1.charAt(word1Index));
            word1Index++;
         }
         if (word2Index < word2.length()) {
            res.append(word2.charAt(word2Index));
            word2Index++;
         }
      }
      return res.toString();
   }

//   public static String mergeAlternately(String word1, String word2) {
//      char[] chars1 = word1.toCharArray();
//      char[] chars2 = word2.toCharArray();
//      char[] rs = new char[chars1.length + chars2.length];
//      int currentIndex = 0;
//      int rsIndex = 0;
//      if (word1.isEmpty()) {
//         return word2;
//      }
//      if (word2.isEmpty()) {
//         return word1;
//      }
//      while (currentIndex < chars1.length && currentIndex < chars2.length) {
//         rs[rsIndex] = chars1[currentIndex];
//         rsIndex++;
//         rs[rsIndex] = chars2[currentIndex];
//         currentIndex++;
//         rsIndex++;
//      }
//      if (currentIndex == chars1.length && currentIndex == chars2.length)
//         return String.valueOf(rs);
//      else if (currentIndex == chars1.length){
//         while (currentIndex < chars2.length){
//            rs[rsIndex] = chars2[currentIndex];
//            rsIndex++;
//            currentIndex++;
//         }
//      }
//      else {
//         while (currentIndex < chars1.length){
//            rs[rsIndex] = chars1[currentIndex];
//            rsIndex++;
//            currentIndex++;
//         }
//      }
//      return String.valueOf(rs);
//   }
}
