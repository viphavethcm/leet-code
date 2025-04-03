package Utils;

import java.util.Arrays;
import java.util.Scanner;

public class Utils {

   public static Integer[] readInput() {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine().trim();
      sc.close();
      if (input.isEmpty()) return new Integer[0];
      String[] parts = input.split(",");
      Integer[] arr = new Integer[parts.length];
      for (int i = 0; i < parts.length; i++)
         arr[i] = parts[i].trim().equalsIgnoreCase("null") ? null : Integer.parseInt(parts[i].trim());
      return arr;
   }

   public static int[] convert(Integer[] arr) {
      return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
   }
}
