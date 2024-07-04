public class oops{
    String name;
    int age;
    void printName(){
        System.out.println("Name");
    }
    void setName(String name){
        this.name = name;
    }
    void getName(){
        System.out.println(name);
    }
    void setAge(intage )
    public static void main(String[] args) {
        oops obj = new oops();
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        obj.printName();
        obj.setName("Arun");
        obj.getName();
        pbj.setAge(age);
        obj.getAge();
    }
}