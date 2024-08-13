package JAVALAB;

import java.util.*;


public class Test2
{
	public static void main(String args[])
	{
		Resistor r1=new Resistor("red","black","orange");
		System.out.println(r1.getResistance());
	}
}

class Resistor
{
	HashMap<String,Integer> color;
	String band1;
	String band2;
	String band3;
	double value; // Resistor value (Ohms)

	public Resistor(){
		band1=band2=band3="";
		value=0.0;
	}

	public Resistor(String b1, String b2, String b3)
	{
		band1=b1;
		band2=b2;
		band3=b3;
		color = new HashMap<>();
		color.put("Black",0);
		color.put("brown",1);
		color.put("red",2);
		color.put("orange",3);
		color.put("yellow",4);
		color.put("green",5);
		color.put("blue",6);
		color.put("violet",7);
		color.put("grey",8);
		color.put("white",9);
	}

	public String getResistance()
	{
		
	}
}
