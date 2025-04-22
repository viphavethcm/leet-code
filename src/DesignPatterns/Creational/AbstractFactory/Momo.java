package DesignPatterns.Creational.AbstractFactory;

// Concrete Product
class Momo implements PaymentMethod {

   @Override
   public void pay(double amount) {
      System.out.println("Thanh toan Momo: " + amount + " thanh cong");
   }
}
