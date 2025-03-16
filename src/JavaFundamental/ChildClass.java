package JavaFundamental;

public class ChildClass extends AbstractClass{

   public ChildClass(int a, int b) {
      super(a, b);
   }

   @Override
   void doSomethingElse() {
      System.out.println("do something else in child class");
      super.doSomethingElse();
   }

   @Override
   public void defaultMethod(String str) {
      super.defaultMethod(str);
   }
}
