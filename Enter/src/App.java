// import java.util.Date;
// import java.awt.*;
// public class App{
  // // access specifier   returntype  methodName        parameter
  //     public             int         addition       (int a,int b){
    //         return a+b;
    //     }
    //     public static void main(String[] args){
      //     int age=30;
      //     byte Age =1;
      //     long views=3_445_665L;
      //     float price=1.9F;
      //     char letter='A';
      //     boolean say=true;
      //     System.out.println(views);
      
      // Date now=new Date();
      // System.out.println(now); //prints the date and time
//     Point point1=new Point(1,2);

//     Point point2=point1;
//     point2.x=5;
//     System.out.println(point1);//point2.x changes affects the value of point1.x due to same address

//     int no1=20,no2=30;
//     App obj=new App();
//     int add=obj.addition(no1, no2);
//     System.out.println("the result is "+ add);
//     }
// }

// import java.util.*;
// class App
// {
//   public static void main(String []aswin)
//   {
//     try{
//         int x,a;
//         int []c={1,2,3};
//         Scanner obj=new Scanner(System.in);
//         a=obj.nextInt();
//         x=100/a;
//         System.out.println(x);
//        try{
//         c[5]=2;
//         }
//         catch(NullPointerException e)
//         {
//           System.out.println(e);
//         }
//       }
//     catch(Exception e)
//     {
//       System.out.println(e);
//     }
//     finally{
//       System.out.println("statement is executed always");
//     }
//     System.out.println("exit of main");
//   }
// }

// import java.io.IOException;
// import java.util.*;

// import java.io.*;
// class App{
//   void fun1()
//   {
//     // int x=100/0;//propagation of exception
//     System.out.println("hi");
//    // java.io.IOException("divide by zero");
//   }
//   void fun2()
//   {
//     fun1();
//   }
//   void fun3()
//   {
//     try{
//       fun2();
//     }
//     catch (Exception e)
//     {
//       System.out.println("exception handled");
//     }
//   }
//   public static void main(String []as_creation)
//   {
//     App o=new App();
//     o.fun3();
//   //   Scanner obj=new Scanner(System.in);
//   //   int age=obj.nextInt();
//   //   if(age>18)
//   //  throw new ArithmeticException("not eligible") ;
 
//     // else
//     // System.out.println("eligible");
//   }
// }

class App
{
    public static void main(String []as)
    {
        int a=10/0;
        System.out.println(a);
    }
}