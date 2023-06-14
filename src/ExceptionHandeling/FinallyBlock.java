package ExceptionHandeling;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            int data = 25/0;
            System.out.println (data);
        }
        catch(Exception c ){
            System.out.println (c);
        }
        finally{
            System.out.println ("hjiuytirr");
        }
    }
}
