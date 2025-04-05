package LeetCode.TwoPointer.easy;

public class ReverseStringII {

   public static void main(String[] args) {
      String input = "abcdefg";
      int k = 2;
      System.out.println(reverseStr(input, k));
   }

   public static String reverseStr(String s, int k) {
      if (s.length() <= 1) return s;
      char[] chars = s.toCharArray();
      for (int i = 0;i < s.length(); i += 2*k) {
         int left = i, right = Math.min(i + k - 1, s.length() - 1);
         while (left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
         }
      }
      return new String(chars);
   }

}
