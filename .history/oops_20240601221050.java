public class oops{
    String name;
    void printName(){
        System.out.println("Name");
    }
    void setName(String name){
        this.name = name;
    }
    void getName(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        oops obj = new oops();
        obj.printName();
        obj.setName("Arun");
        obj.getName();

        obj.getAge()
    }
}