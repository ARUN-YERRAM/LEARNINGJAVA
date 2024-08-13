package JAVALAB;
import java.util.*; 
import java.io.*;
class Data
{  
	String plang,ip,timestamp; 
	Data(String plang,String ip,String timestamp)
	{
		this.plang=plang;
		this.ip=ip;
		this.timestamp=timestamp;
	} 
} 

public class Test6B 
{ 
	public static void main(String[] args) throws Exception 
	{ 
		Scanner sc = new Scanner(System.in); 
		FileReader fr = new FileReader("logfile.txt"); 
		BufferedReader br=new BufferedReader(fr); 
		String line;
		String[] data;
		ArrayList<Data> al=new ArrayList<Data>();
		while((line=br.readLine())!=null) 
		{
			data= line.split("\t");
			Data d=new Data(data[0],data[1],data[2]);
			al.add(d);
		}
		for(Data d : al)
		{
			System.out.println(d.plang+","+d.ip+","+d.timestamp);
		}
		int t1,t2,i,j,n = al.size();
		for(i=0;i<n-1;i++)
		{
		for (j=i+1;j<n;j++) 
		{
			if (al.get(i).plang.equals(al.get(j).plang) && l.get(i).ip.equals(al.get(j).ip))
			{
				t1 = Integer.parseInt(al.get(i).timestamp);
				t2 = Integer.parseInt(al.get(j).timestamp);
				if(t2-t1 <=20)
				{
					al.remove(j);
					n=n-1;
				}
			}
		}
		}
		HashMap<String,Integer> votes=new HashMap<>();
		for(Data d: al)
		{
			int x = votes.getOrDefault(d.plang,0)+1;
			votes.put(d.plang,x);
		}
		Set<Map.Entry<String,Integer>> s1=votes.entrySet();
		for (Map.Entry e : s1) 
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	} 
}
