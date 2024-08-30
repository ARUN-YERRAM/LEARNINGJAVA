import java.util.*;
public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String[] string = str.split(" ");
        // System.out.println(string);
        // for(String it:string){
        //     System.out.print(it);
        // }
        ArrayList<String>ar = new ArrayList<>();
        for(String it:string){
            ar.add(it);
        }
        int cnt = 0;
        for(int i=0;i<ar.size();i++){
            String sr = ar.get(i);

            char[] charArray = sr.toCharArray();
            Arrays.sort(charArray);
            String s;
            for(char c:charArray){
                s += c;
            }for(int j=i+1;j<n;j++){
                String S = ar.get(j);
                char[] ch = 
            }

        }


        // System.out.println(ar);
        // Arrays.sort(ar);
        // Collections.sort(ar);
        // System.out.println(ar);
    }
}
