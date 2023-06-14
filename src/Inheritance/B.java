package Inheritance;

public class B extends A{
    int age;

    public B( String N,String c,int a ){
        super(N,c);
        this.age=a;

        System.out.println ("B is a constractor");
    }
   public void Attribute(){
        super.Attribute ();
        System.out.println (age);
    }

    public static void main(String[] args) {

    B b = new B("Car","Red",2);

  b.Attribute ();
    }
}
