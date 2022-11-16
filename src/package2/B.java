package package2;


//import pacakage1.A;//first method
//import pacakage1.*;//second method
//import pacakage1.A;// third method
import pacakage1.A;//then there is a static import that allows static members to be used without a class name(4 method)
import static pacakage1.A.fstatic;// we have to do this(4 method)



public class B {
    /*public static void main(String[] args) {// First method;
        pacakage1.A a=new pacakage1. A();
        a.finstance();
        pacakage1.A.fstatic();*/


  /*  public static void main(String[] args) {//Second method;
        A a=new A();
        a.finstance();
        A.fstatic();


    }*/
  /*public static void main(String[] args) {//Third method;
      A a= new A();
      a.finstance();
      A.fstatic();
  }*/
  public static void main(String[] args) {
      A a=new A();
      a.finstance();
      fstatic();//we used static members without the class name;


  }

}
