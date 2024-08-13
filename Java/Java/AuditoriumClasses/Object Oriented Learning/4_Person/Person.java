public class Person{
    public String name;
    public byte age;
    public String gender;
    public float weight;
    Person(String name, byte age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void canEat(){
        System.out.println("The person ate");
    }

    public void canWalk(){
        System.out.println("The person Walked");
    }

    public void canSleep(){
        System.out.println("The person slept");
    }
}