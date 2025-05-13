package DesignPatterns.Creational.Template;

// Concrete Product
class ZaloPay implements PaymentStrategy {

   public void pay(double amount) {
      System.out.println("Thanh toán " + amount + " bằng ZaloPay.");
   }
}
