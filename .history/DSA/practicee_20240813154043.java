package DSA;


public class practicee {
    public static void main(String[] args) {
        Box myBox = new Box(10,20,30);
        System.out.println(myBox.volume());
    }
}

class Box{
    public double width;
    public double height;
    public double length;

    Box(double length,double width,double height){
        System.out.println("Values assigned");
        width = this.width;
        height = this.height;
        length = this.length;
    }
    double volume(){
        return this.width*this.height*this.length;
    }
}