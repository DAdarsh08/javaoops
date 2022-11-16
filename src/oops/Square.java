package oops;

public class Square extends Rectangle {
    public Square() {
        super(7);
    }
    @Override
public String toString()
{
    return "In Square";
}
    public static void main(String[] args) {
        Square square=new Square();
        System.out.println(square.getClass());
        System.out.println(square.getClass().getSuperclass());
        System.out.println(square.getClass().getSuperclass().getSuperclass());
        System.out.println(square.getClass().getSuperclass().getSuperclass().getSuperclass());
        System.out.println(square.getClass().getSuperclass().getSuperclass().getSuperclass().getSuperclass());
        System.out.println(square.toString());
    }
}
