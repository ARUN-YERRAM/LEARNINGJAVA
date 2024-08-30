interface HasTail { int getTailLength(); }
  abstract class Puma implements HasTail {
    protected int getTailLength() {return 4;}
  }
  public class Cougar extends Puma {
Introduction
 xxxii 
   public static void main(String[] args) {
       Puma puma = new Puma();
       System.out.println(puma.getTailLength());
     }
 
 11:  public int getTailLength(int length) {return 2;}
 12: 