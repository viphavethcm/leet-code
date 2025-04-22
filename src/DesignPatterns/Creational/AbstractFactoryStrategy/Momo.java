package DesignPatterns.Creational.AbstractFactoryStrategy;

// Concrete Product
class Momo implements PaymentStrategy {

   public void pay(double amount) {
      System.out.println("Thanh toán " + amount + " bằng Momo.");
   }
}
