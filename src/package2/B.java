package package2;


//import pacakage1.A;//first method
//import pacakage1.*;//second method
//import pacakage1.A;// third method
//import pacakage1.A;//then there is a static import that allows static members to be used without a class name(4 method)
//import static pacakage1.A.fstatic;// we have to do this(4 method)
//import pacakage1.A;(5)if we change over to importing all classes a different error will be raise.the compiler cannot differentiate between the classes
//import pacakage3.A;(5)



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
 /* public static void main(String[] args) {  i  used for both  4 and 5 methods)
      A a=new A();
      a.finstance();


      fstatic();//we used static members without the class names;


  }*/
  public static void main(String[] args) {//the onle code work for two same classes in different packages like in case of 5;
      pacakage1.A a=new pacakage1.A();
      a.finstance();
      pacakage1.A.fstatic();
      pacakage3.A b=new pacakage3.A();
      b.finstance();
      pacakage3.A.fstatic();

  }


}
