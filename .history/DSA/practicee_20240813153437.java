package DSA;


public class practicee {
    public static void main(String[] args) {
        Box myBox = new Box();
}

class Box{
    double width;
    double height;
    double length;

    Box(){
        System.pout.println("Values assigned");
        width = 10,height = 10,length = 10;
    }
    double volume(){
        return width*height*length;
    }
}