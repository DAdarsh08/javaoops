package StaticAndInstance;

public class StaticAndInstanceDemo {
    public void printData() {
        System.out.println(staticvariable);
        System.out.println(instancevariable);
    }

    public static String staticvariable = "Static Data";
    public String instancevariable = "Instance Data";

   /* public static void main(String[] args) {
        StaticAndInstanceDemo d1 = new StaticAndInstanceDemo();
        StaticAndInstanceDemo d2 = new StaticAndInstanceDemo();
//        System.out.println(StaticAndInstanceDemo.staticvariable);
//        System.out.println(d1.instancevariable);
//        System.out.println(d2.instancevariable);
        d1.printData();
        d2.printData();
        d1.instancevariable = "New in D1";
        d1.printData();
        d2.printData();
        StaticAndInstanceDemo.staticvariable="New Static";
        d1.printData();
        d2.printData();*/



    }

}
