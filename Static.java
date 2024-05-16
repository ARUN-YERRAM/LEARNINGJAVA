class Mobile{
    static String name;   // instance variable
    int price;
    String brand;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(){
        System.out.println(".............Static method.......");
    }
}
public class Static {
    public static void main(String[] args){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1500;
        Mobile.name = "Smart";

        obj1.name = "Phone";

        obj1.show();
        obj2.show();
        Mobile.show1();
        Mobile.show1();
    }
}
