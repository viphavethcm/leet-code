package LeetCode.TwoPointer.easy;

import java.util.Scanner;

public class ValidPalindrome {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      System.out.println(isPalindrome(input));
   }

   public static boolean isPalindrome(String s) {
      if (s.isEmpty() || s.isBlank()) return true;
      int left = 0;
      int right = s.length() - 1;
      while (left < right) {
         if (!Character.isLetterOrDigit(s.charAt(left))) {
            left++;
            continue;
         }
         if (!Character.isLetterOrDigit(s.charAt(right))) {
            right--;
            continue;
         }
         if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
         else {
            left++;
            right--;
         }
      }return true;
   }
}
