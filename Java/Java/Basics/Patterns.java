import java.util.*;
class Patterns{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int x = sc.nextInt();
        /*Pattern 1 */
        for(int i=0; i<x;i++){
            for(int j=0; j<x; j++){
                if(i==0 || i==x-1 || j==0 || j==x-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        /* Pattern 2 */
        for(int i=1; i<=x;i++){
            for(int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        /* Pattern 3 */
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        /* Pattern 4 */
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            for(int k=1; k<=2*(x-i); k++){
                System.out.print(" ");
            }
            for(int l=1; l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2; i<=x;i++){
            for(int j=x;j>=i;j--){
                System.out.print("*");
            }
            for(int j=1; j<=2*(i-1);j++){
                System.out.print(" ");
            }
            for(int j=x;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        /* Pattern 5 */
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=x; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}