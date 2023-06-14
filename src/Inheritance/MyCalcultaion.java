package Inheritance;

public class MyCalcultaion extends Calculation{
    public void multiplication(int a,int b){
        z=a*b;
        System.out.println ("Multiplication :"+z);
    }
    public void division (int a,int b){
        z= a/b;
        System.out.println ("Division :"+z);
    }

    public static void main(String[] args) {
        MyCalcultaion m = new MyCalcultaion ();
        m.addition (12,34);
        m.Substraction (34,76);
        m.multiplication (12,45);
        m.division (45,9);
    }
}
