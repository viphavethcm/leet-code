package JavaFundamental.Thread;

public class Volatile {
   static volatile boolean stop = false;

   public static void main(String[] args) throws InterruptedException {
      // Thread 1 (Writer): Set stop = true sau 1 giây
      Thread writer = new Thread(() -> {
         try {
            Thread.sleep(1000);
            stop = true;
            System.out.println("✅ Writer: stop = true");
         } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
         }
      });

      // Thread 2 (Reader): Spin loop chờ stop = true
      Thread reader = new Thread(() -> {
         System.out.println("🔄 Reader: Starting spin loop...");
         while (!stop) {
         }
         System.out.println("🛑 Reader: Stopped!");
      });

      reader.start();
      writer.start();

      reader.join(5000);

      if (reader.isAlive()) {
         System.out.println("❌ Reader thread is still running - infinite loop!");
         reader.interrupt();
      } else {
         System.out.println("✅ Reader thread stopped normally");
      }
   }

}
