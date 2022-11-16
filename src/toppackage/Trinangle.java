package toppackage;

public class Trinangle {
    int a,b,c;
    public Trinangle(int a,int b,int c)
    {
       this.a=a;
       this. b=b;
       this.c =c;
        System.out.println(this);
    }
    public Trinangle get()
    {
        return this;
    }
    public String toString()
    {
        return "Triangle{"+"a="+a+",b="+b+",c="+c+"}";
    }

    public static void main(String[] args) {
        Trinangle t1=new Trinangle(4,5,6);
        System.out.println(t1);
        System.out.println(t1==t1.get());
    }
}
