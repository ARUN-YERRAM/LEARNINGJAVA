// Higher level --------> Translator------> Low level languages............

// Print ------- Pre - Cursive ----------> Cursive.........

// Procedural ---> C,Basic,PASCAL............c++ also.....
// Functional ---Pure Functions........... JavScript,Python..........
// OO Oriented Paradigm.............Java,C++..........

// Attributes(Features)......,Methods(Function).........

// Classes.........., Objects..........
// Platform Independent........
// Simple and easy...........
// Large standard library........

// DSA, DEV,Big DATA............
// JAVA ARCHITECTURE............
// JDK,JVM,JRE..........



// Source code ---> compile....>Byte code----> Interpret(By JVM)------->Machine Code----->       
// Compile ONCE RUN ANYWHERE..........

// lowercase 
// uppercase
// camel case .......... all functions and variables are ........
// constant .........Upper snake case with underscore (_)  ...........
// Pascal case .....class ...
// packages ............lowercase................

// variables ......
// no number, no space,   no keyword as variable, variables as camel case and meaningful words, 

// Identifiers,begin with  A-Z / a-z / $ / _  , No keyword are  used,case sensitive, space no..... , 


// Data types :  

// primitive ,built in ----- hold single values,cannot be divided... ---- boolean,char,byte,short,int,long,float,double
// Non primitive ---- user defined, memory address of a variable,  complex    --- strings, arrays, Classes, Interfaces............


public class main{
    public static void main(String args[]){
        System.out.println("Hello World!");
        int i = 12;
        i = 1234;
        System.out.println(i);
        boolean flag = true;  // 1 byte.....
        byte b = 60; // 1 byte
        short s = 1000; // 2 bytes
        int a = 10; // 4 bytes
        long l = 123345; // 8 bytes
        String r = "dhjebj"; 
        float f = 123.456f; // 4 bytes
        double d =3847.84744; // 8 bytes
        char c = 'a'; // 2 bytes

        System.out.println(l);
        System.out.println(flag);
        System.out.print(s);

        i = 1;
        if(i%2==0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }

        for(i=0;i<10;i++){
            System.out.println(i+1);
        }

        do{
            System.out.println(i++);
        } while(i<50);
        i = 1;
        while(i<10){
            System.out.println(i++);
        }
        int [] arr = {1,2,3,4};
        for(int in:arr){
            System.out.print(in);
        }

        int newArray [];
        newArray = new int[20];

        int [] Arr = new int[20];
        
    }
}