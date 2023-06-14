package Constractor;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
     int a;
        Scanner an = new Scanner (System.in);
        System.out.println ("enter the number : ");
          a = an.nextInt ();

        if(a%2==0){
            System.out.println (a+" a is even Number");
        }
        else {
            System.out.println (" a  number is oddd");
        }
    }
}
