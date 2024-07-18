interface Printable{
    void print();  
}

interface Showable extends Printable{  
    void show();
}  

class Interface3 {    
    public static void main(String args[]){  
        try{    
            int a[]=new int[5];    
            a[5]=30/0;    
           }    
           catch(ArithmeticException e){System.out.println("task1 is completed");}    
           catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
           catch(Exception e){System.out.println("common task completed");}    
           System.out.println("rest of the code...");   
    }  
}  
