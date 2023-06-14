package ExceptionHandeling;

public class TestThrow {
    static void validate(int age )  {
        if(age<18)
            System.out.println ();
        else{
            System.out.println (" wellcome to the Vote");
    }}

    public static void main(String[] args) {
        validate (20);
        System.out.println ("rest of the Code");
    }

}
