package DSA;


public class over {
    public static void main(String[] args){
        Bobj = new B();
        obj.demo();
    }
}

class A{
    public void demo(){
        System.out.println("SystemS");
    }
}
class B extends A{
    public void demo(){
        System.out.println("Start!");

        for(int i=0;i<10;i++){
            System.out.println(i+1);
        }
    }
}