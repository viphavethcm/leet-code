package DesignPatterns.Behaviour.Visitor;

public interface EmployeeVisitor {
   void visitFullTime(FullTimeEmployee employee);
   void visitPartTime(PartTimeEmployee employee);
}
