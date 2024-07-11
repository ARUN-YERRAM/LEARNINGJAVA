package SqlJDBC;

interface Animal{
    void eat();
    void sleep();
}

class Dog implements Animal{
    @Override
    public void eat(){
        System.out.println("Dog eats chicken");
    }
    @Override
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
}
public class interface {
    public static void main(String[]args)
}
