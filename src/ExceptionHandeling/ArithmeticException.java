package ExceptionHandeling;

public class ArithmeticException extends Throwable {

    public static void main(String[] args) {


    try{
        int x = 10,y= 10;
        int num = x/y;
        System.out.println (num);
        System.out.println (" Next Srtatement inside the Code");
    }
    catch(Exception c){
        System.out.println (c);
    }
        System.out.println (" Next statemnt outside the code");
}}
