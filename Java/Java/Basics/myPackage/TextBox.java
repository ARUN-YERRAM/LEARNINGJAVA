package myPackage;

public class TextBox{
    public String text = "";

    public void setText(String text){
        this.text = text;
    }
    public void clearText(){
        this.text = "";
    }
    public void printText(){
        System.out.println(this.text);
    }
}
