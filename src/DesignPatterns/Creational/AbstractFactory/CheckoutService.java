package DesignPatterns.Creational.AbstractFactory;

class CheckoutService {

   private PaymentMethod payment;

   public CheckoutService(PaymentFactory factory) {
      this.payment = factory.createPaymentMethod();
   }

   public void checkout(double amount) {
      payment.pay(amount);
   }
}
