

// class test extends Thread
// {
//     public void run()
//     {
//         System.out.println("Thread is created");
//     }
// }
// public class thread {
//     public static void main(String []aswin)
//     {
//         //  test t1=new test();
//         //  t1.start();
//         Thread t=Thread.currentThread();
//         System.out.println("current thread : "+t);
//         t.setName("My thread");
//         t.setPriority(8);
//         System.out.println("after change : "+ t);
//     }
// }


// //thread by using time
// class thread extends Thread
// {
//     public void run()
//     {
//         try{
//             for(int i=5;i>0;i--)
//             {
//                 System.out.println(i);
//                Thread.sleep(500);
//             }
//         }
//         catch(InterruptedException e)
//         {
//                 System.out.println(e);
//         }
//     }
//     public static void main(String[] args) {
//         thread t1=new thread();
//         thread t2=new thread();
//         t1.start();
//         t2.start();
//     }
// }


// class test extends Thread
// {
//     Thread t;
//     test()
//     {
//         t=new Thread(this,"test thread");
//         System.out.println(t);
//         t.start();
//     }
//     public void run()
//     {
//         try
//         {
//             for(int i=5;i>0;i--)
//             {
//                 System.out.println("child thread "+ i);
//                 Thread.sleep(500);
//             }
//         }
//         catch(InterruptedException e)
//         {
//                 System.out.println(e);
//         }
//         System.out.println("child exited");
//     }
// }
// class thread 
// {
//     public static void main(String[] args) {
//         test t=new test();
        
//     }
// }


// class test implements Runnable{
//     Thread t;
//     String tname;
//     test(String name)
//     {
//         tname=name;
//         t=new Thread(this,"thread");
//         System.out.println(t);
//         t.start();
//     }
//     public void run()
//     {
//         try{
//             for(int i=5;i>0;i--)
//             {
//                 Thread.sleep(1000);
//                 System.out.println(tname+" "+i);
//             }
//         }
//         catch(InterruptedException e )
//         {
//             System.out.println(e);
//         }
//         System.out.println(tname+" exited");
//     }




// }
// class thread{
//     public static void main(String[] args) {
//         test t1=new test("one");
//         test t2=new test("two");
//         test t3=new test("three");
//         try{
//                 Thread.sleep(1000);
//         }
//         catch(InterruptedException e)
//         {
//             System.out.println(e);
//         }
//         System.out.println("main exited");
//     }
// }


// //by using join keyword
// class test implements Runnable{
//     Thread t;
//     String tname;
//     test(String name)
//     {
//         tname=name;
//         t=new Thread(this,"thread");
//         System.out.println(t);
//         t.start();
//     }
//     public void run()
//     {
//         try{
//             for(int i=5;i>0;i--)
//             {
//                 Thread.sleep(1000);
//                 System.out.println(tname+" "+i);
//             }
//         }
//         catch(InterruptedException e )
//         {
//             System.out.println(e);
//         }
//         System.out.println(tname+" exited");
//     }

// }
// class thread{
//     public static void main(String[] args) {
//         test t1=new test("one");
//         test t2=new test("two");
//         test t3=new test("three");
//         try{
//                 t1.t.join();
//                 t2.t.join();
//                 t3.t.join();
//         }
//         catch(InterruptedException e)
//         {
//             System.out.println(e);
//         }
//         System.out.println("main exited");
//     }
// }


// class thread extends Thread 
// {
//     public void run()
//     {
//         try{
//             for(int i=1;i<5;i++)
//             {
//                 Thread.sleep(1000);
//                 System.out.println(i);
//             }
//         }
//         catch(InterruptedException e)
//         {
//             System.out.println(e);
//         }
//     }
//     public static void main(String[] args)  {
//         thread m1=new thread();
//         thread m2=new thread();
//         thread m3=new thread();
//         m1.start();
//         System.out.println("thread one ");
//         try{

//             m1.join();//join provide synchronous lock 
            
//         }
//         catch(InterruptedException e)
//         {
//             System.out.println(e);
//         }
//           m2.start();
//           System.out.println("thread two");
//           m3.start();
//           System.out.println("thread three ");
//           System.out.println("main exit..");
        
//     }
// }

import java.util.*;
class dem  extends Thread
{  int a,b,d;
    dem(int a,int b){
        this.a=a;
        this.b=b;
  
    }
  public  void run()
   {
         //Thread.sleep(1000);
     d=a*b;
   }
}
class quo  extends Thread
{  int a,b,q;
    quo(int a,int b){
     this.a=a;
     this.b=b;
    }
  public  void run()
   {
     q=a+b;
   }
}
class thread{
    public static void main(String []aswin)
    {  int a=5,b=10;
        quo t1=new quo(a,b);
        dem t2=new dem(a,b);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println((float)t1.q/t2.d);
    }
}