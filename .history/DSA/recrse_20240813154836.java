package DSA;

public class recrse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Factorial f = new Factorial();
        System.out.println(f.Fact(n));
    }
}

class Factorial{
    int Fact(int n){
        if(n == 1)return 1;
        else return n*Fact(n-1);
    }
}