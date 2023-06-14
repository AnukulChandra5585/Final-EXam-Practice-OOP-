package Encapsulation;

import java.security.PublicKey;

public class Person {
    private String Name ;
    private int age ;
    public void setInformation(String n,int a){
        this.Name = n;
        this.age = a;

    }
    public String getName(){
        return Name ;
    }
    public int getAge (){
         return age;
    }
    public void display(){
        System.out.println (" NAme :"+getName ());
        System.out.println ("Age :"+getAge ());
    }

    public static void main(String[] args) {
        Person p = new Person ();
        p.setInformation ("Anukul Chandra",22);
        p.display ();
        System.out.println (p.getAge ());
        System.out.println (p.getName ());
    }
}
