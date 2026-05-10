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



