import java.util.*;
public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String[] string = str.split(" ");
        System.out.println(string);
        // for(String it:string){
        //     System.out.print(it);
        // }
        ArrayList<String>ar = new ArrayList<>();
        for(String it:string){
            ar.add(it);
        }

        System.out.println(ar);
    }
}
