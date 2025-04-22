package DesignPatterns.Structural.Composite;

// Composite Pattern cho phép xử lý đối tượng đơn lẻ và đối tượng tổ hợp (cây) theo cùng một cách.
//               root
//      file1    file2    subFolder
//                        file
public class CompositePattern {

   public static void main(String[] args) {
      Folder root = new Folder("Root");
      File file1 = new File("a.txt");
      File file2 = new File("b.txt");
      Folder subFolder = new Folder("Sub");

      subFolder.addItem(new File("c.txt"));
      root.addItem(file1);
      root.addItem(file2);
      root.addItem(subFolder);

      root.show();
   }
}
