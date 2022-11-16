package toppackage;

public class Manager extends Employee{
    String department;
    Employee secretary;
    public Manager(String name, String address,int age , int salary,Employee sec,String d)
    {
        super(name, address,age,"toppackage.Manager",salary);
        secretary=sec;
        department=d;
    }
    public String toString()
    {
        return super.toString()+", Department="+department+",secreatary="+secretary;

    }

    public static void main(String[] args) {
        Employee e1=new Employee("popat","mumbai",40,"secreatary",1000);
        Manager m1=new Manager("adarsh","kolkata",18,2000000,e1, "computer science");
        System.out.println(e1);
        System.out.println(m1);
        System.out.println(e1.salarywithDA());
        System.out.println(m1.salarywithDA());
    }
}
