package DSA;


public class practicee {
    
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