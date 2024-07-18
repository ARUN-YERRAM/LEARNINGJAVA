interface Printable{
    int MIN = 5;
    void print();
}

class A6 implements Printable{
    public void print(){
        System.out.println("Hello");
    }
}
public class Interface1{
    public static void main(String[] args){
        A6 a6 = new A6();

        a6.print();
        System.out.println(A6.MIN);
    }
}
