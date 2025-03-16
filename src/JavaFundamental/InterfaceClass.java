package JavaFundamental;

public interface InterfaceClass {

   default void defaultMethod(String str){
      System.out.println("interface default method: " + str);
   }
}
