package DesignPatterns.Behaviour.Visitor;

public class PartTimeEmployee implements Employee {

   public int salary = 500;
   public float hourlyRate = 0.7F;

   @Override
   public void accept(EmployeeVisitor visitor) {
      visitor.visitPartTime(this);
   }
}
