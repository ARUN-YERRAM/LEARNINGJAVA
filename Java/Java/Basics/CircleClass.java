class Circle{
    Circle(double radius){
        this.radius = radius;
    }
    private double radius;

    public void area(){
        System.out.println(Math.PI * radius * radius);
    }

    public void circumference(){
        System.out.println(2 * Math.PI * radius);
    }

}

public class CircleClass {
    public static void main(String[] args){
        Circle c1 = new Circle(200);
        c1.area();
        c1.circumference();
    }
}
