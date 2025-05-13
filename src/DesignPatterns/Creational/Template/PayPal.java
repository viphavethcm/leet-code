package DesignPatterns.Creational.Template;

// Concrete Product
class PayPal implements PaymentStrategy {

   public void pay(double amount) {
      System.out.println("Pay $" + amount + " via PayPal.");
   }
}
