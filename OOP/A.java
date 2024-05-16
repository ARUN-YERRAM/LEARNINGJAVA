// 1.package pack1;
 
class A
{
    protected static String s = "A";
}
 
class B extends A
{
     
}
 
class C extends B
{   
    static void methodOfC()
    {
        System.out.println(s);
    }
}

