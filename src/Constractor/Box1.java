package Constractor;
// Default Constractor ;
public class Box1 {
     int height,weight;
     public Box1(){
         System.out.println (" The Box is Created ");
         this.height= 20;
         this.weight= 37;
     }

    public static void main(String[] args) {
        Box1 box1 = new Box1 ();
        System.out.println (" The height of the  Box1 : "+box1.height);
        System.out.println (" the weight of the Box 1: "+box1.weight);
    }
}
