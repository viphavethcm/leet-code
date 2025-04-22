package DesignPatterns.Creational.AbstractFactory;

import java.util.Random;

// Concrete Factories
class VNPaymentFactory implements PaymentFactory {

   @Override
   public PaymentMethod createPaymentMethod() {
      int random = new Random().nextInt(3);
      if (random % 2 == 0) {
         return new Momo();
      }
      return new ZaloPay();
   }
}
