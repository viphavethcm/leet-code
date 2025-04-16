package LeetCode.TwoPointer.easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.println(isHappy(num));
   }

   // Floyd's Cycle-Finding Algorithm
   public static boolean isHappy(int n) {
      int slow = n;
      int fast = getNext(n);
      while (fast != 1 && slow != fast) {
         slow = getNext(slow);
         fast = getNext(getNext(fast));
      }
      return fast == 1;
   }

   public static int getNext(int n) {
      int rs = 0;
      while (n < 10) {
         int num = n % 10;
         rs += num * num;
         n = n / 10;
      }
      return rs;
   }

   // 2 Pointer
//   public static boolean isHappy(int n) {
//      Set<Integer> set = new HashSet<>();
//      while (n != 1) {
//         if (set.contains(n)) return false;
//         set.add(n);
//         String s = String.valueOf(n);
//
//         int left = 0, right = s.length() - 1;
//         int rs = 0;
//         while (left < right) {
//            int numL = s.charAt(left) - '0';
//            int numR = s.charAt(right) - '0';
//            rs += numL * numL + numR * numR;
//            left++;
//            right--;
//         }
//         if (left == right) {
//            int last = s.charAt(left) - '0';
//            rs += last * last;
//         }
//         n = rs;
//
//      }
//      return true;
//   }

}
