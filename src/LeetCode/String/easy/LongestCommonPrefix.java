package LeetCode.String.easy;

import java.util.Scanner;

public class LongestCommonPrefix {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] str = sc.nextLine().split(" ");
      System.out.println(longestCommonPrefix(str));
   }

   public static String longestCommonPrefix(String[] strs) {
      if (strs.length == 0) return "";
      if (strs.length == 1) return strs[0];
      String common = strs[0];
      for (int i = 1; i < strs.length; i++) {
         while (!common.isEmpty()){
            if (strs[i].startsWith(common)){
               break;
            }
            common = common.substring(0, common.length() - 1);
         }
      }
      return common;
   }
}
