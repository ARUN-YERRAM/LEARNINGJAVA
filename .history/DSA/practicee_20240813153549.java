package DSA;


public class practicee {
    public static void main(String[] args) {
        Box myBox = new Box();
        System.out.println(myBox.volume());
    }
}

class Box{
    double width;
    double height;
    double length;

    Box(double length,double width,double ){
        System.out.println("Values assigned");
        width = 10;
        height = 10;
        length = 10;
    }
    double volume(){
        return width*height*length;
    }
}