package DSA;

public class Inheritance extends Inherit{
    public static void main(){
        Inheritance obj = new Inheritance();
        obj.Print();

        obj.Print("Arun");
        
    }
}

class Inherit{
    public void Print(){
        System.out.println("start!");

        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

    public void Print(String str){
        System.out.println("Start!");
        for(int i=0;i<10;i++){
            System.out.println(i+1 + str);
        }
    }
}
