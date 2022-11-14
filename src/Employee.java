public class Employee extends Person {
    String post;
    int salary;
    public Employee(String n,String ad,int ag,String p,int s)
    {
        super(n,ad,ag);
        post=p;
        salary=s;
    }
    public double salarywithDA()
    {
        return (111.0*salary)/100;
    }
    public String toString()
    {
        return super.toString()+", post="+post+", salary= "+salary;
    }
}
