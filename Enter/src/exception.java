// import java.io.*;
// import java.util.*;
// class exception{
//     void func() throws IOException
//     {
       
//         throw new IOException("device errror");
//     }
//  public static void main(String[] aswin) throws IOException
//  {  
//      Scanner obj=new Scanner(System.in);
//      String String=obj.next();

//      exception o=new exception();
//      try{
//         o.func();
//     }
//     catch(ArithmeticException e)
//     {
//             System.out.println("exception handled");
//     }
//     //     System.out.println("exit");
// }
// }


import java.io.*;
class myexception extends Exception
{   String msg;
    myexception(String A)
    {
        msg=A;
    }
    public String toString()
    {
        return msg;
    }
}
class test 
{
    void validate(int age) throws myexception
    {
      if(age<18)
      {
        throw new myexception("not eligible");
      }
      else
      System.out.println("welcome");
    }
}
class exception
{
    public static void main(String []aswin)
    {
            test o=new test();
            try{
                o.validate(21);
                o.validate(12);
            }
            catch(myexception e)
            {
                System.out.println(e);
            }
    }
}