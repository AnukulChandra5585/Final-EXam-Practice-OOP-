import Abstract.Demo;

public class test extends Demo {
    public void play(){
        System.out.println ("pk");
    }


    public static void main(String[] args) {
        test t = new test ();
        t.play ();
        t.setName ("Anukul");
        System.out.println (t.getName ());
    }
}
