package DesignPatterns.Creational.Template;

import static DesignPatterns.Creational.Template.PaymentType.CREDITCARD;
import static DesignPatterns.Creational.Template.PaymentType.MOMO;
import static DesignPatterns.Creational.Template.PaymentType.PAYPAL;
import static DesignPatterns.Creational.Template.PaymentType.ZALOPAY;

public class TemplatePattern {

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
