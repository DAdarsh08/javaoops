package toppackage;

public class Triangle1 {
    int a,b,c;
    public Triangle1(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;

    }
    public Triangle1 currentObject()
    {
        return this;
    }
    public String toString(){
        return "Triangle{"+"a="+a+",b="+b+",c="+c+"}";
    }

    public static void main(String[] args) {
        Triangle1 t1=new Triangle1(4,5,6);
        System.out.println(t1);
        Triangle1 x=t1.currentObject();
        x.a=5;
        System.out.println(t1);
        System.out.println(x);
        System.out.println(t1==x);


    }



}
