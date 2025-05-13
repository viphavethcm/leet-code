package DesignPatterns.Creational.Template;

// Concrete Product
class Momo implements PaymentStrategy {

   public void pay(double amount) {
      System.out.println("Thanh toán " + amount + " bằng Momo.");
   }
}
