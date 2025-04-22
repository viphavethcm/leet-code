package DesignPatterns.Behaviour.Visitor;

public class SalaryReport implements EmployeeVisitor {

   @Override
   public void visitFullTime(FullTimeEmployee employee) {
      System.out.println("Full time salary: " + employee.salary);
   }

   @Override
   public void visitPartTime(PartTimeEmployee employee) {
      float salary = (float) employee.salary * employee.hourlyRate;
      System.out.println("Part time salary: " + salary);
   }

}