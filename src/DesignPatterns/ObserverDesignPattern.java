package DesignPatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// Lí do cần tạo Observer interface vì để decoupling object User và Youtube Channel. Nếu mai mốt có thêm object khác
// User thì chỉ cần implement interface, ko cần sửa code của Youtube Channel
interface Observer {
   void update(String message);
}

// Concrete Observer
class User implements Observer {
   private String name;

   public User(String name) {
      this.name = name;
   }

   @Override
   public void update(String message) {
      System.out.println(name + " nhận được thông báo: " + message);
   }
}

// Concrete Observer
class BotAutomation implements Observer {
   private String name;

   public BotAutomation(String name) {
      this.name = name;
   }

   @Override
   public void update(String message) {
      System.out.println(name + " nhận được thông báo: " + message);
   }
}

class YouTubeChannel {
   private List<Observer> observers = new ArrayList<>();

   public void subscribe(Observer observer) {
      observers.add(observer);
   }

   public void unsubscribe(Observer observer) {
      observers.remove(observer);
   }

   public void uploadNewVideo(String videoTitle) {
      System.out.println("Kênh vừa đăng video mới: " + videoTitle);
      notifyObservers("Video mới: " + videoTitle);
   }

   public void uploadNewVideo(String videoTitle, List<Observer> observers) {
      System.out.println("Kênh vừa đăng video mới: " + videoTitle);
      notifyObservers("Video mới: " + videoTitle, observers);
   }

   private void notifyObservers(String message) {
      for (Observer observer : observers) {
         observer.update(message);
      }
   }

   private void notifyObservers(String message, List<Observer> observers) {
      for (Observer observer : observers) {
         observer.update(message);
      }
   }
}

public class ObserverDesignPattern {

   public static void main(String[] args) {
      YouTubeChannel channel = new YouTubeChannel();

      // get users which subscribe into Youtube Channel from DB
      List<User> users = List.of(new User("Duy"), new User("Nguyen"), new User("Ngoc"));

      // cast users into observers
      List<Observer> observers =  users.stream().map(user -> (Observer) user).toList();

//
//      Observer user1 = new User("Alice");
//      Observer user2 = new User("Bob");
//
//      channel.subscribe(user1);
//      channel.subscribe(user2);

      channel.uploadNewVideo("New Video Clip", observers);
   }
}
