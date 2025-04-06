package LeetCode.TwoPointer.easy;

public class CheckIfWordOccursAsPrefix {

   public static void main(String[] args) {
      String sentence = "dumb dream duck duck i";
      String searchWord = "drea";
      System.out.println(isPrefixOfWord(sentence, searchWord));
   }

   public static int isPrefixOfWord(String sentence, String searchWord) {
      int currentPosition = 1;
      int currentIndex = 0;
      int searchWordLen = searchWord.length();
      int matchCount = 0;
      char[] chars = sentence.toCharArray();
      while (currentIndex < sentence.length()) {
         if (chars[currentIndex] == ' ') {
            currentIndex++;
            currentPosition++;
            matchCount = 0;
         }
         while (currentIndex < sentence.length() && chars[currentIndex] == searchWord.charAt(matchCount)) {
            currentIndex++;
            matchCount++;
            if (matchCount == searchWordLen) {
               return currentPosition;
            }
         }
         while (currentIndex < sentence.length() && chars[currentIndex] != ' ') {
            currentIndex++;
         }
      }
      return -1;
   }
}
