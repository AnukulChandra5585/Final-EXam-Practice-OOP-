package ScannerClass;

import java.util.Scanner;

public class AddTwoInt {
    int a,b,Add;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter First Number :");
        int a = sc.nextInt ();
        System.out.println (" ENTER The Secomd Number :");
        int b = sc.nextInt ();
         int Add = a+b;
        System.out.println ("Addition : "+Add);

    }
}
