package Abstract;

import Inheritance.A;

public class Lion extends Animal {
    public void eat(){
        System.out.println (" Lion eat");
    }
    public void move(){
        System.out.println (" lion mOves");
    }
    public void hunt(){
        System.out.println ("lions are Hunting");
    }

    public static void main(String[] args) {
        Lion l = new Lion ();
        l.eat ();
        l.hunt ();
        l.move ();
    }
}
