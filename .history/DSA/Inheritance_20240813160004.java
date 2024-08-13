package DSA;

class Inherit{
    public void Print(){
        System.out.println("start!");

        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

    public void Print(String str){
        System.out.println("Start!");
        for(int i=0;i<10;i++){
            System.out.println(i+1 + str);
        }
    }
}
