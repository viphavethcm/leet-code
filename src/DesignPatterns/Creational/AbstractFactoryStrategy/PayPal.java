package DesignPatterns.Creational.AbstractFactoryStrategy;

// Concrete Product
class PayPal implements PaymentStrategy {

   public void pay(double amount) {
      System.out.println("Pay $" + amount + " via PayPal.");
   }
}
