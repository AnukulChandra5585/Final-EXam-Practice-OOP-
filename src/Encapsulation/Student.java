package Encapsulation;

public class Student {
    private String Name ;
     private int id ;
     private double cgpA;
     public void setName (String n){
         this.Name =n;

     }
     public void setInformation(int i,double c){
         this.id = i;
         this.cgpA= c;

     }
     public String getName (){
         return Name;

     }
     public int getId(){
         return id;
     }
     public double getCqpa(){
         return cgpA;
     }

    public static void main(String[] args) {
         Student s = new Student ();
         s.setName ("Anukul Chandra");
         s.setInformation (5585,3.78);
        System.out.println (s.getName ());
        System.out.println (s.getId ());
        System.out.println (s.getCqpa ());

    }

}
