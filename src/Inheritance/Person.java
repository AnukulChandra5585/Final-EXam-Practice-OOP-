package Inheritance;

public class Person {
    protected String name ;
    protected int age ;
    public Person(String n,int a){
        this.name= n;
        this.age= a;
        System.out.println (" Perosn Class created");
    }
    public void display(){
        System.out.println (name);
        System.out.println (age);
    }

}
