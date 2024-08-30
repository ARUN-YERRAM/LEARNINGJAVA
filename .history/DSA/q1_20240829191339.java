import java.util.*;
public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String[] string = str.split(" ");
        
        ArrayList<String>ar = new ArrayList<>();
        for(String it:string){
            ar.add(it);
        }
        int n = ar.size();
        int cnt = 0;
        Set<String>st;
        for(int i=0;i<ar.size();i++){
            String sr = ar.get(i);

            char[] charArray = sr.toCharArray();
            Arrays.sort(charArray);
            String s;
            for(char c:charArray){
                s += c;
            ArrayList<Integer>a = new ArrayList<>();
            a.add(i);
            // cnt++;
            st.add(ar.get(i));
            boolean f = true;
            for(int j=i+1;j<n;j++){
                String S = ar.get(j);
                char[] ch = S.toCharArray();
                Arrays.sort(ch);
                String t;
                for(char it:ch){
                    t += it;
                }
                if(s.equals(t)){
                    a.add(j);
                    cnt++;
                    st.add(ar.get(j));
                }
                if(st.size() == n){
                    f= false;
                    break;
                }
            }
            for(int it:a){
                System.out.print(ar.get(it) + " ");
            }System.out.println();
            if(st.size() == n){
                break;
            }
        }
    }


        // System.out.println(ar);
        // Arrays.sort(ar);
        // Collections.sort(ar);
        // System.out.println(ar);
    }
}
