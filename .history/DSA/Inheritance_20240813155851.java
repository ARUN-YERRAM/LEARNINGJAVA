package DSA;

class Inherit{
    public void Print(){
        System.out.println("start!");

        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

    public void Print()
}
public class Inheritance extends Inherit{
    public static void main(){
        Inheritance obj = new Inheritance();
        obj.Print();
    }
}