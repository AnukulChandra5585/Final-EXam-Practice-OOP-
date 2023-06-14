package JavaMethod;

public class MethodOverLoading {
    public void sum (int a,int b){
        System.out.println ("Sum :"+(a+b));
    }
    public void sum(int a,int b,int c){
        System.out.println ("Sum = "+(a+b+c));
    }

    public static void main(String[] args) {
        MethodOverLoading m = new MethodOverLoading ();
        m.sum (12,34);
        m.sum (12,14,45);
    }
}
