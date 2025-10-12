package JavaFundamental.Thread;

public class ThreadExample {
   private static final Object lock = new Object();

   public static void main(String[] args) throws InterruptedException {
      getNewState();
      System.out.println("-------------------------------");
      getRunnableState();
      System.out.println("-------------------------------");
      getBlockState();
   }

   public static void getNewState() {
      Thread thread = new Thread(() -> System.out.println("Thread is running"));
      System.out.println("Thread state: " + thread.getState()); // NEW
      System.out.println("Thread is alive: " + thread.isAlive()); // false
   }

   public static void getRunnableState() {
      Thread thread = new Thread(() -> {
         System.out.println("Thread started");
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
         }
         System.out.println("Thread finished");
      });

      System.out.println("Before start: " + thread.getState()); // NEW

      thread.start();
      System.out.println("After start: " + thread.getState()); // RUNNABLE

      // Thread có thể chuyển giữa RUNNABLE và RUNNING
      // RUNNABLE: Thread sẵn sàng chạy nhưng chưa được CPU schedule
      // RUNNING: Thread đang thực sự chạy trên CPU
   }

   public static void getBlockState() throws InterruptedException {
      Thread thread1 = new Thread(() -> {
         synchronized (lock) {
            System.out.println("Thread 1 acquired lock");
            try {
               Thread.sleep(5000); // Giữ lock lâu
            } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
            }
         }
      });

      Thread thread2 = new Thread(() -> {
         System.out.println("Thread 2 trying to acquire lock");
         synchronized (lock) {
            System.out.println("Thread 2 acquired lock");
         }
      });

      thread1.start();
      Thread.sleep(100); // Đảm bảo thread1 chạy trước

      thread2.start();
      Thread.sleep(100);

      System.out.println("Thread 2 state: " + thread2.getState()); // BLOCKED

      thread1.join();
      thread2.join();
   }
}
