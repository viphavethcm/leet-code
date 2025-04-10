package LeetCode.TwoPointer.easy;

import java.util.Scanner;

public class ValidPalindromeII {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      System.out.println(validPalindrome(input));
   }

   public static boolean validPalindrome(String s) {
      int left = 0, right = s.length() - 1;
      char[] chars = s.toCharArray();

      while (left < right) {
         if (chars[left] != chars[right]) {
            boolean res1 = checkPalindrome(chars, left + 1, right); // Nếu a[i] != a[j] thì tăng i+1, coi như là delete 1 phần tử i
            boolean res2 = checkPalindrome(chars, left, right - 1); // Nếu a[i] != a[j] thì lùi j-1, coi như là delete 1 phần tử j
            return res1 || res2;
         }
         left++;
         right--;
      }
      return true;
   }

   public static boolean checkPalindrome(char[] chars, int left, int right) {
      while (left < right) {
         if (chars[left] != chars[right]) return false;
         left++;
         right--;
      }
      return true;
   }
}
