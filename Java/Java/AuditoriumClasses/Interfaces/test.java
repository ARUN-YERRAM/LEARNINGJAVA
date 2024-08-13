public class test {
    static void show(){
        try{
            System.out.println("Inside Try");
            return;
        } finally {
            System.out.println("Inside Finally");
        }
    }
    public static void main(String[] args) {
        show();
    }
}
