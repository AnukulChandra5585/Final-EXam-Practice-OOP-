package Inheritance;

public class CseTeacher extends Teacher{
    public String mainSubject="CSE";

    public static void main(String[] args) {
        CseTeacher c = new CseTeacher ();
        System.out.println (c.designation);
        System.out.println (c.uniName);
        System.out.println (c.mainSubject);
        c.job ();
    }
}
