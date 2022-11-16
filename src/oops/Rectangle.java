package oops;

public class Rectangle {
    int l, b;

//    public Rectangle() {
//        l = 0;
//        b = 0;
//    }

    public Rectangle(int x) {
        l = x;
        b = x;
    }

    public Rectangle(int x, int y) {
        l = x;
        b = y;
    }

    public String toString() {

        if (l == b) {
            return "OOPS.Square:l=" + l + ",b=" + b;
        } else {
            return "OOPS.Rectangle l=" + l + " ,b=" + b;
        }
    }

    public int perimeter() {
        return 2 * l + 2 * b;
    }

    public int area() {
        return l * b;
    }

    public double diagonal() {
        return Math.sqrt(l * l + b + b);
    }

   /* public static void main(String[] args) {
        OOPS.Rectangle r1=new OOPS.Rectangle();
        OOPS.Rectangle r2=new OOPS.Rectangle(5);
        OOPS.Rectangle r3=new OOPS.Rectangle(5,3);
        System.out.printf("%s,Area=%s,Diagonal=%s,perimeter=%s\n",r1,r1.area(),r1.diagonal(),r1.perimeter());

    }*/
}

