package DesignPatterns.Creational;

import java.util.Random;

// Abstract Product
interface PaymentMethod {
   void pay(double amount);
}

// Concrete Product
class Momo implements PaymentMethod {

   @Override
   public void pay(double amount) {
      System.out.println("Thanh toan Momo: " + amount + " thanh cong");
   }
}
// Concrete Product
class ZaloPay implements PaymentMethod {

   @Override
   public void pay(double amount) {
      System.out.println("Thanh toan ZaloPay: " + amount + " thanh cong");
   }
}
// Concrete Product
class PayPal implements PaymentMethod {

   @Override
   public void pay(double amount) {
      System.out.println("Thanh toan Paypal: " + amount + " thanh cong");
   }
}

// AbstractFactory
interface PaymentFactory {
   PaymentMethod createPaymentMethod();
}

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

// Concrete Factories
class USPaymentFactory implements PaymentFactory {

   @Override
   public PaymentMethod createPaymentMethod() {
      return new PayPal();
   }
}

class CheckoutService {
   private PaymentMethod payment;

   public CheckoutService(PaymentFactory factory) {
      this.payment = factory.createPaymentMethod();
   }

   public void checkout(double amount) {
      payment.pay(amount);
   }
}

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
