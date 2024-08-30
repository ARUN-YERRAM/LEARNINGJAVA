
public class c extends Puma {


    public static void main(String[] args) {
        Puma puma = new Puma();
        System.out.println(puma.getTailLength());
      }
  
    
 
     }
   

interface HasTail { int getTailLength(); }



   class Puma implements HasTail {
    public int getTailLength() {return 4;}
  }
  