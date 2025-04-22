package DesignPatterns.Creational.AbstractFactoryStrategy;

import static DesignPatterns.Creational.AbstractFactoryStrategy.PaymentType.CREDITCARD;
import static DesignPatterns.Creational.AbstractFactoryStrategy.PaymentType.MOMO;
import static DesignPatterns.Creational.AbstractFactoryStrategy.PaymentType.PAYPAL;
import static DesignPatterns.Creational.AbstractFactoryStrategy.PaymentType.ZALOPAY;

import java.util.Map;
import java.util.function.Supplier;

// Abstract Product Strategy
interface PaymentStrategy {
   void pay(double amount);
}

enum PaymentType {
   MOMO, ZALOPAY, PAYPAL, CREDITCARD;
}
// Concrete Product
class MomoStrategy implements PaymentStrategy {
   public void pay(double amount) {
      System.out.println("Thanh toán " + amount + " bằng Momo.");
   }
}
// Concrete Product
class ZaloPayStrategy implements PaymentStrategy {
   public void pay(double amount) {
      System.out.println("Thanh toán " + amount + " bằng ZaloPay.");
   }
}
// Concrete Product
class PayPalStrategy implements PaymentStrategy {
   public void pay(double amount) {
      System.out.println("Pay $" + amount + " via PayPal.");
   }
}
// Concrete Product
class CreditCardStrategy implements PaymentStrategy {
   public void pay(double amount) {
      System.out.println("Pay $" + amount + " via CreditCard.");
   }
}

class PaymentStrategyManager {

   Map<PaymentType, Supplier<PaymentStrategy>> strategies = Map.of(
         MOMO, MomoStrategy::new,
         ZALOPAY, ZaloPayStrategy::new,
         PAYPAL, PayPalStrategy::new,
         CREDITCARD, CreditCardStrategy::new
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

public class AbstractFactoryStrategy {

   public static void main(String[] args) {
      PaymentStrategyManager manager = new PaymentStrategyManager();
      manager.showOptions();
      PaymentStrategy paymentStrategy;

      paymentStrategy = manager.getStrategy(ZALOPAY);
      paymentStrategy.pay(10);

      paymentStrategy = manager.getStrategy(MOMO);
      paymentStrategy.pay(20);

      paymentStrategy = manager.getStrategy(CREDITCARD);
      paymentStrategy.pay(30);

      paymentStrategy = manager.getStrategy(PAYPAL);
      paymentStrategy.pay(40);
   }
}
