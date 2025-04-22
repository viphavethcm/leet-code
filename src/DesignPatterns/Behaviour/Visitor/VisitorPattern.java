package DesignPatterns.Behaviour.Visitor;

// What:
//    Visitor Pattern cho phép bạn định nghĩa một thao tác vào nhiều lớp đối tượng khác nhau mà không cần thay đổi các lớp đó.
//    Bạn "gửi visitor đến" đối tượng, và đối tượng đó sẽ gọi lại visitor để thực thi logic tương ứng.
// When:
//    Khi muốn thêm nhiều thao tác (hành vi) lên các class, nhưng không muốn hoặc không thể sửa các class đó.
//    Khi các class có nhiều phương thức xử lý tương tự nhau, muốn gom logic vào 1 chỗ (Visitor).
//    Khi các class thuộc về hierarchy khác nhau, nhưng cần xử lý theo ngữ cảnh kiểu của chúng.
public class VisitorPattern {

   public static void main(String[] args) {
      Employee fullTimeEmployee = new FullTimeEmployee();
      Employee partTimeEmployee = new PartTimeEmployee();
      EmployeeVisitor visitor = new SalaryReport();
      fullTimeEmployee.accept(visitor);
      partTimeEmployee.accept(visitor);
   }
}
