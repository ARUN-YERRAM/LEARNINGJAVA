/*
-->Greedy approach solves Fractional Knapsack problem reasonably in a good time

-->In this problem we have a Knapsack that has a weight limit M.

-->There are items i1, i2, ..., in each having weight w1, w2, .. wn and some b
enefit (value or profit) associated with it p1, p2, ..., pn 

-->Our objective is to maximize the benefit such that the total weight inside 
the knapsack is at most M, and we are also allowed to take an item in fractional 
part.


sample oputput:
case 1:

enter kanpsack size
60
enter the no.of Items
4
enter the weigths of Items
40
10
20
24
enter the profits of Items
280
100
120
120
feasible solution is
Itemno  Weights Profits pi/wi Ratio     Selected
2       10.0    100.0   10.0            1.0
1       40.0    280.0   7.0             1.0
3       20.0    120.0   6.0             0.5
4       24.0    120.0   5.0             0.0
Optimal Solution: Maximum Profit is
440.0

case 2:
enter kanpsack size
16
enter the no.of Items
6
enter the weigths of Items
6
10
3
5
1
3
enter the profits of Items
6
2
1
8
3
5
feasible solution is
Itemno  Weights Profits pi/wi Ratio     Selected
5       1.0     3.0     3.0             1.0
6       3.0     5.0     1.6666666               1.0
4       5.0     8.0     1.6             1.0
1       6.0     6.0     1.0             1.0
3       3.0     1.0     0.33333334              0.33333334
2       10.0    2.0     0.2             0.0
Total Profit is
22.333334

*/
import java.util.*; 
class Greedy_Knapsack 
{ 
public static void main(String args[]) 
{ 
int m,i,j,k[],temp1; 
float max,temp; 
float  w[],p[],r[],x[],n,w1=0,sum=0; 
Scanner sc=new Scanner(System.in); 
System.out.println("enter kanpsack size "); 
n=sc.nextFloat(); 
System.out.println("enter the no.of Items "); 
m=sc.nextInt(); 
w=new float[m]; 
p=new float[m]; 
r=new float[m]; 
x=new float[m]; 
k=new int[m]; 
System.out.println("enter the weigths of Items "); 
for(i=0;i<m;i++) 
{ 
k[i]=i+1; 
w[i]=sc.nextInt(); 
} 
System.out.println("enter the profits of Items"); 
for(i=0;i<m;i++) 
{ 
p[i]=sc.nextInt(); 
} 
for(i=0;i<m;i++) 
{ 
r[i]=p[i]/w[i]; 
} 
for(i=0;i<m-1;i++) 
{ 
for(j=0;j<m-i-1;j++) 
{ 
if(r[j+1]>r[j]) 
{ 
temp=r[j]; 
                                                                                                                                                           
 
                    r[j]=r[j+1]; 
                    r[j+1]=temp; 
 
                    temp=p[j]; 
                    p[j]=p[j+1]; 
                    p[j+1]=temp; 
 
                    temp=w[j]; 
                    w[j]=w[j+1]; 
                    w[j+1]=temp; 
 
                    temp1=k[j]; 
                    k[j]=k[j+1]; 
                    k[j+1]=temp1; 
} 
} 
} 
        for(i=0;i<m;i++) 
        { 
            if(n>w[i]) { 
                n=n-w[i]; 
                x[i]=1; 
            } 
            else if(n==0){ 
                x[i]=0; 
            } 
            else 
            { 
                x[i]=n/w[i]; 
                n=0; 
            } 
        } 
        System.out.println("feasible solution is "); 
        System.out.println("Itemno"+"\t"+"Weights"+"\t"+"Profits"+"\t"+"pi/wi Ratio"+"\t"+"Selected"); 
        for(i=0;i<m;i++) 
        { 
            System.out.print(k[i]+"\t"+w[i]+"\t"+p[i]+"\t"+r[i]+"\t"+"\t"+ x[i]+"\n"); 
        } 
        for(i=0;i<m;i++) 
        { 
            sum=sum+(x[i]*p[i]);  
        }
 
        System.out.println("Optimal Solution: Maximum Profit is "); 
        System.out.println(sum); 
      
} 
}