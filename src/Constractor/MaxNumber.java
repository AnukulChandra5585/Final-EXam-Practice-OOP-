package Constractor;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int a ,b;
        System.out.printf ("Enter the 1 st Number :");
        Scanner an = new Scanner (System.in);
          a = an.nextInt ();
        System.out.printf ("Enter the 2nd Number :");
        b =an.nextInt ();
        if(a>b){
            System.out.printf (a+" a is max number ");
        }
        else{
            System.out.println (b+" b is max number");
        }

    }
}
