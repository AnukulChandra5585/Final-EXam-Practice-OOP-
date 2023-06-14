package Inheritance;

public class Programmer  extends Employee{
    float bonus = 1000;

    public static void main(String[] args) {
        Programmer p = new Programmer ();
        System.out.println (" Programmer Saalry :"+p.salary);
        System.out.println (" Bonus of Programmer :"+p.bonus);

    }

}
