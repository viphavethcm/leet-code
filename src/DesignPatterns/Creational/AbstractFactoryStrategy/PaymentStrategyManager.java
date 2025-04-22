package DesignPatterns.Creational.AbstractFactoryStrategy;

import static DesignPatterns.Creational.AbstractFactoryStrategy.PaymentType.CREDITCARD;
import static DesignPatterns.Creational.AbstractFactoryStrategy.PaymentType.MOMO;
import static DesignPatterns.Creational.AbstractFactoryStrategy.PaymentType.PAYPAL;
import static DesignPatterns.Creational.AbstractFactoryStrategy.PaymentType.ZALOPAY;

import java.util.Map;
import java.util.function.Supplier;

class PaymentStrategyManager {

   Map<PaymentType, Supplier<PaymentStrategy>> strategies = Map.of(
         MOMO, Momo::new,
         ZALOPAY, ZaloPay::new,
         PAYPAL, PayPal::new,
         CREDITCARD, CreditCard::new
   );

   PaymentStrategy getStrategy(PaymentType paymentType) {
      return strategies.get(paymentType).get();
   }

   void showOptions() {
      System.out.println("Chọn phương thức thanh toán:");
      for (PaymentType paymentType : strategies.keySet()) {
         System.out.println("- " + paymentType.name());
      }
   }
}
