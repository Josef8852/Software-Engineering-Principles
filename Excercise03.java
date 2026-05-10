// Blatt 03 ST

import java.util.List;
import java.util.ArrayList;

public class Excercise03 {
    public static void main(String[] args) {}
}

// Aufgabe 3.1 Lösung

interface Engine {
    void start();
}

class DieselEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Diesel engine starts");
    }
}

class Car {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
    }
}




// Aufgabe 3.2 Lösung 

  class UserManager {
      public void createUser ( String name , String email ) { }
      public void deleteUser ( int userId ) { }
  }

 class UserActivityLogger {
     public void logUserActivity ( int userId , String activity ) {}
     public void exportLogs ( String path ) {  }
}



// Aufgabe 3.3 Lösung 

  class Collection {
 private List <String > items = new ArrayList <>() ;

 public void addItem(String item ) { 
     items.add( item ) ;
 }

 
 public String retrieveElement (int index ) {
 return items.get( index ) ;
 }

 
 public void insertAt(int index , String item) {
 items.set( index , item ) ;
 }

 public void dropItem( String item ) {
     items.remove(item) ; 
 }
 
 }




 // Aufgabe 3.2 Lösung 

  class Bird {
     protected double altitude = 0.0;
 
     // Increases flight altitude by meters. Expects meters > 0.
     public void fly(double meters) {
         if (meters > 0) {
             altitude += meters;
         }
     }
 
     public double getAltitude() {
         return altitude;
     }
 }
 
 class Pigeon extends Bird {}
 
 class Penguin extends Bird {
 
     @Override
     public void fly(double meters) {
         throw new UnsupportedOperationException("Penguins cannot fly!");
     }
 }


 /*  a) Bei Bird und Pigeon bleibt die Invariante erhalten, da fly() die Höhe erhöht, 
 während Penguin sie verletzt, 
 da fly() eine Exception wirft und somit nicht wie ein Bird verwendbar ist. */


 // Von a)  gilt das Liskov’sche Ersetzungsprinzip nur für Bird und Pigeon 
 