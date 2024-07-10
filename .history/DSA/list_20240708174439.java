package DSA;

public class list {
    public static void main(String[] args){
        ArrayList<Integer>li = new ArrayList<>();

        li.add(1);
        li.add(2);
        li.add(1,2);
        li.add(0,34);

        System.out.println(li);
        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }

        li.remove(0);
    }
}
