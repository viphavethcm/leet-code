package JavaFundamental;

public abstract class AbstractClass implements InterfaceClass{

   int a;
   int b;

   public AbstractClass(int a, int b) {
      this.a = a;
      this.b = b;
   }

   @Override
   public void defaultMethod(String str) {
      InterfaceClass.super.defaultMethod(str);
   }

   void doSomethingElse() {
      System.out.println(a);
      System.out.println("do something in parent class");
   }

}
