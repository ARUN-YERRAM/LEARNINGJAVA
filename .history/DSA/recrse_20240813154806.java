package DSA;

public class recrse {
    public static void main(String[] args){
        Factorial f = new Factorial();
        System.out.println(f.Fact(10));
    }
}

class Factorial{
    int Fact(int n){
        if(n == 1)return 1;
        else return n*Fact(n-1);
    }
}
