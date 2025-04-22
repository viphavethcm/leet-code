package DesignPatterns.Creational.AbstractFactory;

// Concrete Product
class PayPal implements PaymentMethod {

   @Override
   public void pay(double amount) {
      System.out.println("Thanh toan Paypal: " + amount + " thanh cong");
   }
}
