interface printable{
    void print();
}

interface showable extends printable{
    void show();
}

class myClassAgain implements showable{
    void print(){
        System.out.println("Printable");
    }
    void show(){
        System.out.println("Showable");
    }
}