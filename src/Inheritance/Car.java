package Inheritance;

public class Car extends Vehicle2 {
    public int speed =45;
    public Car() {
        super (100);

        this.speed= speed;
        System.out.println (speed);
        System.out.println (" car is Created");
    }

    public void display() {
        super.display ();
        System.out.println (" Car is created ");
        System.out.println (super.speed);

    }

    public static void main(String[] args) {


        Car c = new Car ();
        c.display ();

    }
}