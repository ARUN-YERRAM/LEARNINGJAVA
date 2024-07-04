public class oops{
    STring name;
    void printName(){
        System.out.println("Name");
    }
    void setName(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        oops obj = new oops();
        obj.printName();
        obj.setName("Arun");
    }
}