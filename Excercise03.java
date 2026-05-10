// Blatt 03 ST

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




 