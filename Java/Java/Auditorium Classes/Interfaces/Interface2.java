interface Printable{
    int PRINTED = 5;
    void print();
}

interface Showable{
    int SHOWED = 10;
    void show();
}

class MyClass implements Printable, Showable{
    public void print(){
        System.out.println("Printed: "+PRINTED);
    }
    public void show(){
        System.out.println("Showed: "+SHOWED);
    }
}
public class Interface2 {
    public static void main(String[] args){
        MyClass m = new MyClass();
        m.print();
        m.show();
    }
}
