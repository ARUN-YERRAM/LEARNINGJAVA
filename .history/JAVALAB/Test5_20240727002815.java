package JAVALAB;

class MySquare extends MyRectangle {
    public int length;

    public MySquare(int xcord, int ycord, int length) {
        super(xcord, ycord, xcord + length, ycord + length);
        this.length = length;
    }

    @Override
    public int area() {
        return length * length;
    }

    @Override
    public String toString() {
        return String.format("Class MySquare:[(%d,%d);(%d,%d)]", v1x, v1y, v1x + length, v1y + length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int len = sc.nextInt();

        MySquare square = new MySquare(x, y, len);
        System.out.println(square.area());
        System.out.println(square.toString());
    }
}
