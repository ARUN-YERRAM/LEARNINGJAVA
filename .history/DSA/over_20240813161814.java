package DSA;

class A{
    public void demo(){
        System.out.println("SystemS");
    }
}
class B extends A{
    
}
public class over {
    A obj = new B();
    A.demo();
}