package Interface;

public class Circle implements Drawing{
    public void draw(){
        System.out.println (" I Draw a Circle");
    }

    public static void main(String[] args) {
        Circle c = new Circle ();
        c.draw ();
    }
}
