import javax.lang.model.util.ElementScanner14;

// import java.util.Arrays;
// import java.util.Scanner;
// public class hello {
//     public static void main(String[] args) {
//       // System.out.println("Hello World");
//       // int number[]={2,4,1,9,2};
//       // Arrays.sort(number);
//       // //number[0]=1;number[2]=9;
//       // System.out.println("1 dimensional array : "+Arrays.toString(number));//1D

//       // int [][]arr=new int [2][3]; // int[][] arr={{1,2,3},{4,5,6}}
//       // arr[0][0]=2;
//       // arr[1][2]=23;
//       // System.out.println("2 dimesional array : "+Arrays.deepToString(arr));  //2D
     
      
      
      
//       // Reverse the string
//       StringBuffer obj= new StringBuffer("all is well");
//       StringBuilder rev=new StringBuilder();
//       for(int i=obj.length()-1;i>=0;i--)
//       {
//         rev.append(obj.charAt(i));
//       }
//         System.out.println("The Reverse string is : "+rev);




//         //uppercase the string 
//         StringBuffer a=new StringBuffer("abc");
//         System.out.println("original string : "+a);
//         //to change to uppercase
//         for(int i=0;i<a.length();i++)
//         {
//           if(a.charAt(i)>=97 && a.charAt(i)<=122)
//           {
//             int c=(int)a.charAt(i)-32;
//             a.setCharAt(i, (char)c);
//           }
//         }
//         System.out.println("uppercase: "+a);



//       int count=0;
//       //capitalize the each word;
//        for(int i=0;i<obj.length();i++)
//        {  
//         if(count==0 )
//         {  count=1;
//           int c=(int)obj.charAt(i)-32;
//           obj.setCharAt(i,(char)c);
//         }
//         else if( obj.charAt(i)==' ')
//         { int j=i+1;
//           int c=(int)obj.charAt(j)-32;
//           obj.setCharAt(j,(char)c);
//         }
//        }
//        System.out.println(obj);
//     }
//   }

// class hello{
//   public static void main(String[] AS_Creation) {
//     String b="cccssssseeee";
//     int count=0,k=0;
//     for(int i=0;i<b.length();i++)
//     {
//       if(b.charAt(i)=='c' && count==0)
//       count=1;
//       else if(b.charAt(i)=='s' && count==1)
//       count=2;
//       else if(b.charAt(i)=='e' && count==2)
//       count=3;
//       else if(b.charAt(i)!='c'&&b.charAt(i)!='s' && b.charAt(i)!='e'  )
//      count=0;
//       if(count==3)
//       {
//         System.out.println(true);
//         k=1;
//         break;
//       }

//     }
//     if(k==0)
//     System.out.println(false);
//   }
// }


// public class hello extends Thread  
// {    String k;
//   hello(String h){
//    k=h;
//   }
//     public void run()  
//     {    
//         for(int i=1;i<5;i++)  
//         {    
//             try  
//             {  
//                 Thread.sleep(500);  
//             }catch(InterruptedException e){System.out.println(e);}    
//             System.out.println(k+" " +i);    
//         }    
//     }    
//     public static void main(String args[])  
//     {    
//         hello t1=new hello("t1");    
//         hello t2=new hello("t2");   
//         t1.start();    
//         try{
//           t1.join();
//         } 
//         catch(Exception e)
//         {
          
//         }
//         t2.start();    
//     }    
// }  



