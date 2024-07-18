import java.util.*;
class JavaExercise{
    public static float avg(float x, float y, float z){
        return (x+y+z)/3;
    }
    public static void printOddNos(int n){
        System.out.println("The odd numbers from 0 to "+n+" are:");
        for(int i=0; i<=n; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 3 numbers to find the average of: ");
        // float x=sc.nextFloat();
        // float y=sc.nextFloat();
        // float z=sc.nextFloat();
        // System.out.println("Average of "+x+" "+y+" "+z+" is "+avg(x,y,z)+".");
        // printOddNos(200);

        int t = sc.nextInt();
        int p = 0, n = 0, z = 0;
        while(t>0){
            int x = sc.nextInt();
            if(x>0){
                p++;
            } else if (x==0) {
                z++;
            } else {
                n++;
            }
            t--;
        }
        System.out.println("Positive: "+p+"\nNegative: "+n+"\nZeroes: "+z);

        sc.close();
    }
}