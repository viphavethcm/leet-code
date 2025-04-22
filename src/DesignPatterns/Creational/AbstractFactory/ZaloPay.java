package DesignPatterns.Creational.AbstractFactory;

// Concrete Product
class ZaloPay implements PaymentMethod {

   @Override
   public void pay(double amount) {
      System.out.println("Thanh toan ZaloPay: " + amount + " thanh cong");
   }
}
