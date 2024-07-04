public class oops{
    void printName(){
        System.out.println("Name");
    }
    void setName(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        oops obj = new oops();
        obj.printName();
    }
}