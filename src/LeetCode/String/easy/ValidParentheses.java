package LeetCode.String.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

   public static void main(String[] args) {
      String s = "]";
      System.out.println(isValid(s));
   }

   public static boolean isValid(String s) {
      Deque<Character> queue = new ArrayDeque<>();
      for (char c: s.toCharArray()) {
         if (c == '(' || c == '{' || c == '[') {
            queue.push(c);
         }
         else if (queue.isEmpty() || !compare(queue.pop(), c)){
            return false;
         }
      }
      return queue.isEmpty();
   }

   public static boolean compare(char open, char close) {
      if (open == '(' && close == ')' || open == '{' && close == '}' || open == '[' && close == ']') {
         return true;
      }
      return false;
   }
}
