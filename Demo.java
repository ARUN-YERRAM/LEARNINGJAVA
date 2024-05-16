
interface Computer{
    public abstract void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile , run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code , compile , run , : Faster");
    }
}
class Developer{
    public void dev(Computer lap){
        lap.code();
    }
}
public class Demo{
    public static void main(String[] args){
        Computer  lap = new Laptop();
        Computer  desktop = new Desktop();

        Developer Arun = new Developer();

        Arun.dev(desktop);
    }
}