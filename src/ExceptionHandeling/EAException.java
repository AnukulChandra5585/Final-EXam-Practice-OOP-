package ExceptionHandeling;

public class EAException {
    public static void main(String[] args) {

        try {

            int a[]= {1,2,3,4};
            a[3]= 12;
            System.out.println (a);
        } catch (Exception c) {
            System.out.println (c);
        }
        System.out.println ("rest of the Codsde");
    }}