package DSA;

abstract Car{
    abstract void demo();
}
public class abs extends Car{
    void demo(){
        System.out.println("Start!");

        for(int i=0;i<10;i++){
            System.out.println(i+1);
        }
    }
    public static void main(String[] args){
        abs obj  = new abs();
        obj.demo();
    }
}
