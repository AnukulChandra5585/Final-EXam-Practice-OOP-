package ScannerClass;

import java.util.Scanner;

public class Substraction {
    double a, b,subs;

    public static void main(String[] args) {
        Scanner an = new Scanner (System.in);
        System.out.println (" Enter The 1st Number :");
        double a = an.nextDouble ();
        System.out.println (" Enter The @ nd Number :");
        double b = an.nextDouble ();
        double subs = a- b;
        System.out.println (" Substraction :"+subs);

        }
    }

