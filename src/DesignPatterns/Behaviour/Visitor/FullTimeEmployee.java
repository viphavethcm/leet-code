package DesignPatterns.Behaviour.Visitor;

public class FullTimeEmployee implements Employee {

   public int salary = 500;

   @Override
   public void accept(EmployeeVisitor visitor) {
      visitor.visitFullTime(this);
   }
}
