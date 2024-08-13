public class demo {
    public static void main(String[] args){
    try(FileReader fr = new FileReader("e.txt")){
        System.out.println("Hello");
        // print all data in e.txt

    }catch(Exception e){
        System.out.println("Bye");
        System.out.printz(e);
    }
}
