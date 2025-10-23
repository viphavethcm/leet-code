package JavaFundamental.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class RaceCondition {
   static int count = 0;
   public static void main(String[] args) {
      ExecutorService executor = Executors.newFixedThreadPool(100);
      List<CompletableFuture<Void>> futures = new ArrayList<>();

      for (int i = 0; i < 100; i++) {
         final int taskId = i;

         CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            incre();
            System.out.println("✅ Task " + taskId + " completed");
         }, executor);
         futures.add(future);
      }

      // Đợi tất cả tasks hoàn thành
      CompletableFuture<Void> allFutures = CompletableFuture.allOf(
            futures.toArray(new CompletableFuture[0])
      );
      try {
         allFutures.get(30, TimeUnit.SECONDS);
         System.out.println(count);
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      } catch (ExecutionException e) {
         throw new RuntimeException(e);
      } catch (TimeoutException e) {
         throw new RuntimeException(e);
      }
   }

   public static void incre() {
      for (int i = 0; i < 10000; i++) {
         count++;
      }
   }

}
