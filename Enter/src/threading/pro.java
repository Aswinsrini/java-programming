import java.util.*;
class test
{   //synchronized
    public void disp(String msg)
    {
        System.out.print("["+msg);
        try {
            Thread.sleep(1000);
            System.out.println("]");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class demo extends Thread{
    String msg;
    test t1;
    Thread t;
    demo(test t2,String st)
    {
        msg=st;
        t1=t2;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {   
     synchronized(t1)
        {t1.disp(msg);}
    }
}
class pro
{
        public static void main(String a[])
        {
            test t3=new test();
           
            demo d1=new demo(t3,"hai");
            demo d2=new demo(t3,"hello");
             demo d3=new demo(t3,"welcome");
        }
    }

