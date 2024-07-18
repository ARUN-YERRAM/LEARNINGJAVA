interface A extends B, C{
    
}
interface B {
    default void m1(){
        System.out.println("Hi");
    }
}
interface C {
    default void m1(){
        System.out.println("Hey");
    }
}
class D implements A{
    
}


// class A {
//     void m1() {
//         System.out.println("Hi");
//     }
// }
// class B {
//     void m1() {
//         System.out.println("Hii");
//     }
// }

// class C extends A,B{
    
// }
public class Test {
    public static void main(String[] args) {
        A c = new D();
        c.m1();
    }
}
