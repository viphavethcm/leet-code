package Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

   public static List<int[]> readInputList() {
      Scanner scanner = new Scanner(System.in);
      List<int[]> arrays = new ArrayList<>();

      while (true) {
         String line = scanner.nextLine().trim();

         if (line.isEmpty()) break;

         // Thay tất cả dấu phẩy bằng space → dễ tách
         line = line.replaceAll(",", " ");
         String[] tokens = line.trim().split("\\s+"); // tách theo 1 hoặc nhiều space

         int[] arr = new int[tokens.length];
         for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
         }

         arrays.add(arr);
      }
      return arrays;
   }

   public static int[] convert(Integer[] arr) {
      return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
   }
}
