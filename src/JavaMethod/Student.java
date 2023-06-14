package JavaMethod;

public class Student {
    private String id ;
    private String Name ;
    private double Cgpa ;
    public void InserT_Record(String i ,String n,double c){
        this.id= i;
         this.Name= n;
         this.Cgpa=c;
    }
    public void Display_Record(){
        System.out.println (" Id :"+id);
        System.out.println (" name :"+Name);
        System.out.println (" CGPA :"+Cgpa);
    }

    public static void main(String[] args) {
        Student s= new Student ();
        s.InserT_Record ("221-15-55"," Anukul Chandra",3.78);
        s.Display_Record ();
    }

}
