package LeetCode.TwoPointer.easy;

public class FindTheIndexOfTheFirstOccurrence {

   public static void main(String[] args) {
      String haystack = "a", needle = "a";
      System.out.println(strStr(haystack, needle));
   }

   public static int strStr(String haystack, String needle) {
      int i = 0;
      while (i + needle.length() <= haystack.length()) {
         if (haystack.charAt(i) == needle.charAt(0)) {
            String compareStr = haystack.substring(i, needle.length() + i);
            if (compareStr.equals(needle)) {
               return i;
            }
         }
         i++;
      }
      return -1;
   }

}
