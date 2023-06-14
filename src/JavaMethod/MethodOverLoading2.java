package JavaMethod;

public class MethodOverLoading2 {
    public void sum(int a,int b){
        System.out.println ("Sum = "+(a+b));
    }
    public void sum(double a,double b){
        System.out.println ("Sum = "+(a+b));

    }

    public static void main(String[] args) {
        MethodOverLoading2 M = new MethodOverLoading2 ();
        M.sum (12.9,45.54);
        M.sum (12.0,56.8);
    }
}
