package DesignPatterns.Structural.Composite;

public class File implements FileSystems {
   private String name;
   public File(String name) { this.name = name; }

   @Override
   public void show() {
      System.out.println("File: " + name);
   }
}
