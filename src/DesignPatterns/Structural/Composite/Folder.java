package DesignPatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

// Sử dụng FileSystems thay vì List<File> vì FileSystems chứa cả folder và file
public class Folder implements FileSystems {
   private String name;
   private List<FileSystems> items = new ArrayList<>();

   public Folder(String name) { this.name = name; }

   public void addItem(FileSystems item) {
      items.add(item);
   }

   @Override
   public void show() {
      System.out.println("Folder: " + name);
      for (FileSystems item : items) {
         item.show(); // gọi đệ quy
      }
   }
}