package LeetCode.TwoPointer.easy;

import java.util.Scanner;
/**
 * https://leetcode.com/problems/add-digits/description/
 * */
public class AddDigits {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.println(addDigits(num));
   }

   public static int addDigits(int num) {
      int digitalRoot = 0;
      while (num > 0) {
         digitalRoot += num % 10;
         num = num / 10;

         if (num == 0 && digitalRoot > 9) {
            num = digitalRoot;
            digitalRoot = 0;
         }
      }
      return digitalRoot;
   }
}
