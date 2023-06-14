package ScannerClass;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner an = new Scanner (System.in);
        System.out.println (" Enter Your Name :");
        String name = an.nextLine ();
        System.out.println (" NAme :"+name);
    }
}
