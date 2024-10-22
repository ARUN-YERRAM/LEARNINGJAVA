public class string{
    public static void main(String[] args){
        String str = "0123456789";
        System.out.println(str.substring(1,3));
        System.out.println(str.substring(7,7));
        System.out.println(str.substring(7));
        boolean x =true,z = true;
        int y = 20;
        x = (y!=10)^(z=false);
        System.out.println(x + " "+ y+" "+z);


    }
}