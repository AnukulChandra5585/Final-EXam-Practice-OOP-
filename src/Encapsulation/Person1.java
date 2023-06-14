package Encapsulation;

public class Person1 {
    private String Name ;
    private int age ;
    public Person1(String n,int a ){
        this.Name=n;
        this.age =a;
        System.out.println (" NAme :"+Name);
        System.out.println ("Age :"+age);
    }
    public void setInformation(String n,int a){
        this.Name=n;
        this.age = a;

    }
    public String getName (){
        return Name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Person1 p = new Person1 ("Anukul CAhndra",22);
    }
}
