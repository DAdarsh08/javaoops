package toppackage;

public class Person {
    String name, address;
    int age;
    public Person(String n,String ad,int ag)
    {
        name=n;
        address=ad;
        age=ag;

    }
    public String toString()
    {
        return "Name="+name+", Address ="+address+" ,Age= "+age;

    }

}
