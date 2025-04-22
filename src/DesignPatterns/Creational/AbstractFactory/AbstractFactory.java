package DesignPatterns.Creational.AbstractFactory;

import java.util.Random;

public class AbstractFactory {

   public static void main(String[] args) {
      PaymentFactory paymentFactory;
      int ran = new Random().nextInt(2);
      if (ran % 2 == 0) {
         paymentFactory = new USPaymentFactory();
      }else {
         paymentFactory = new VNPaymentFactory();
      }
      CheckoutService checkoutService = new CheckoutService(paymentFactory);
      checkoutService.checkout(10);
   }
}
