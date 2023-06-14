package Inheritance;

public class Bike extends Vehicle {
    public void run() {
        System.out.println (" Bike Moves");
    }

    public static void main(String[] args) {
        Bike b = new Bike ();
        b.run ();
    }
}
