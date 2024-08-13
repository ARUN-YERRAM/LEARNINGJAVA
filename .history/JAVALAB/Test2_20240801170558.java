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
		clolor = new hash
		color.put("black",0);
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
		int firstdig=color.get(band1);
		int seconddig=color.get(band2);
		int thirddig=(int)Math.pow(10,color.get(band3));
		String value1=Integer.toString(firstdig)+Integer.toString(seconddig);
		value=Integer.parseInt(value1)*thirddig;
		value=value/1000;
		value1=value+"Kilo_ohms";
		return value1;
	}
}
