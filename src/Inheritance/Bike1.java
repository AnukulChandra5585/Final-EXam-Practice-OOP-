package Inheritance;

public class Bike1 extends Vehicle1{
    public int speed = 100;
    public void display()
    {
        super.display ();
        System.out.println (" the Speed of Vehiclee is "+super.speed);
    }

    public static void main(String[] args) {
        Bike1 b = new Bike1();
        System.out.println ("Bike speed :"+b.speed);
        b.display ();


    }

}
