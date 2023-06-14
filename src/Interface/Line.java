package Interface;

public class Line implements Drawing{
    public void draw(){
        System.out.println ("I draw  a line");
    }

    public static void main(String[] args) {
        Line l = new Line();
        l.draw ();
    }
}
