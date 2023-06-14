package Constractor;

public class MyClass3 {
    int x ;
    public MyClass3(int y){
        this.x= y;

    }

    public static void main(String[] args) {
        MyClass3 m = new MyClass3 (23);
        System.out.println (m.x);
    }
}
