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

    Box(double length,double width,double height){
        System.out.println("Values assigned");
        width = this.width;
        height = this.;
        length = 10;
    }
    double volume(){
        return width*height*length;
    }
}