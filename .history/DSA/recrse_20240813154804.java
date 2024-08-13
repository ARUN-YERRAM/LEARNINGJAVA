package DSA;

class Factorial{
    int Fact(int n){
        if(n == 1)return 1;
        else return n*Fact(n-1);
    }
}
