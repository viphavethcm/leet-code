package LeetCode.Array.medium;

import java.util.ArrayList;
import java.util.List;
/**
 * https://leetcode.com/problems/generate-parentheses/
 * */

public class GenerateParentheses {

   public static void main(String[] args) {
      List<String> ans = generateParenthesis(3);
      for (String s: ans) {
         System.out.println(s);
      }
   }
   public static List<String> generateParenthesis(int n) {
      List<String> res = new ArrayList<>();
      backtrack(res, n, new StringBuilder(), 0, 0);
      return res;
   }

   public static void backtrack(List<String> ans, int n, StringBuilder currString, int left, int right) {
      if (currString.length() >= 2*n) {
         ans.add(currString.toString());
         return;
      }
      if (left < n) {
         currString.append("(");
         backtrack(ans, n, currString, left + 1, right);
         currString.deleteCharAt(currString.length() - 1);
      }
      if (right < left) {
         currString.append(")");
         backtrack(ans, n, currString, left, right + 1);
         currString.deleteCharAt(currString.length() - 1);
      }
   }
}
