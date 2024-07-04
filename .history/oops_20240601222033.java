import java.util.*;

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
    void setAge(int age){
        this.age = age;
    }
    void getAge(){
        System.out.println(age);
    }
    public static void main(String[] args) {
        oops obj = new oops();
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        obj.printName();
        obj.setName("Arun");
        obj.getName();
        obj.setAge(age);
        obj.getAge();
    }
}

class Student{
    String name;
    int roll_no;

    Student obj = new Student();
    obj.getName();

}