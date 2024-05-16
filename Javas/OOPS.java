class Pen{
    String color;
    String type;
    // String color;


    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    Student(){
        System.out.println("Constructor Called!");
    }

    Student(Student st2){
        this.name = st2.name;
        this.age = st2.age;
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void study(){
        System.out.println("Studying");
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
    
    public void printName(){
       
            System.out.println("Name is " + name);
        
    }
    public void age(){
        System.out.println("Age is " + age);
    }

    public static void Code(){
        System.out.println("Coding is Coding");
    }
}

class Shape{
    String name;
    
}

Class Triangle extends Shape{
    
}
public class OOPS{
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.color = "Purple";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Yellow";
        pen2.type = "ballpoint";
        pen2.write();
        pen2.printColor();
        pen1.printColor();

        Student st1 = new Student();
        st1.name = "ARUN";
        st1.age = 19;
        st1.printName();
        st1.age();
        st1.printInfo();

        Student st2 = new Student(st1);
        st2.printInfo();

        // Code();
    }
}


