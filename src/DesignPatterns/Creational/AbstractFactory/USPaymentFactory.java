package DesignPatterns.Creational.AbstractFactory;

// Concrete Factories
class USPaymentFactory implements PaymentFactory {

   @Override
   public PaymentMethod createPaymentMethod() {
      return new PayPal();
   }
}
