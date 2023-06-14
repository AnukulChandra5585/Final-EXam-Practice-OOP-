package Inheritance;

public class A {
     String Name ;
     String colour ;
    public A( String n,String c){
        this.Name= n;
        this.colour= c;

        System.out.println (" A is a A constractor");
    }
    public void Attribute(){
        System.out.println (Name);
        System.out.println (colour);
    }
}
