package JAVALAB;
import java.util.*;

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


class Test5 {
    public int v1x;
    public int v1y;
    public int v2x;
    public int v2y;

    public Test5(int ver1x, int ver1y, int ver2x, int ver2y) {
        v1x = ver1x;
        v1y = ver1y;
        v2x = ver2x;
        v2y = ver2y;
    }

    public int area() {
        return Math.abs((v2x - v1x) * (v2y - v1y));
    }

    public MyRectangle overlap(MyRectangle rect) {
        int x1 = Math.max(v1x, rect.v1x);
        int y1 = Math.max(v1y, rect.v1y);
        int x2 = Math.min(v2x, rect.v2x);
        int y2 = Math.min(v2y, rect.v2y);

        if (x1 > x2 || y1 > y2) {
            return new MyRectangle(0, 0, 0, 0);
        } else {
            return new MyRectangle(x1, y1, x2, y2);
        }
    }

    @Override
    public String toString() {
        return String.format("Class MyRectangle:[(%d,%d);(%d,%d)]", v1x, v1y, v2x, v2y);
    }
}
