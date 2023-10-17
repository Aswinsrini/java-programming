import java.util.*;
import java.io.*;
class Array
{    
    static void push(int n)
    {//int i=0;
        top++;
      stack[top]=n;
    }
    void pop()
    {
        top--;
    }
    static void print()
    {
        for(int i=top;i>=0;i--)
        System.out.print(stack[i]+" ");
    }
   static int stack[] =new int[10],top=-1;
    public static void main(String[]arg)
    {
      push(10);
      push(20);
      push(30);
      push(100);
      Array k=new Array();
      k.pop();
      print();

    }
}





// // method to get input 
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Array
// {    static void myMethod()
//     {
//         System.out.println("code executed");
//     }
//     public static void main (String args[])throws IOException
//     {
//         BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
//         String name=obj.readLine();
//        System.out.println(name);
//        myMethod();
//        myMethod();
//     }
// }



