package DesignPatterns.Creational.Template;

// Concrete Product
class CreditCard implements PaymentStrategy {

   public void pay(double amount) {
      System.out.println("Pay $" + amount + " via CreditCard.");
   }
}
