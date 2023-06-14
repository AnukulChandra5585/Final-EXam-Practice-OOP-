package Abstract;

public class Car extends Vehicle{
    public void move(){
        System.out.println (" Car moves slowly ");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.move ();
        c.Carry ();
    }
}
