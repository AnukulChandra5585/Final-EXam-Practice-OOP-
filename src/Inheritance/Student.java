package Inheritance;

public class Student extends Person{
    private int id ;
    private double cgpa;
    public Student(String n,int a,int i,double c){
        super("Anukul",a);
        this.id= i;
        this.cgpa=c;
    }
    public void display(){
        super.display ();
        System.out.println (id);
        System.out.println (cgpa);
    }

    public static void main(String[] args) {
        Student s = new Student ("",22,5585,3.78);
        s.display ();
    }
}
