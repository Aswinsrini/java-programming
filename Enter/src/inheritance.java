import java.util.Scanner;
public class inheritance{
   
    public static void main(String[] args)
    {   //1st
        int gms=3200;
        System.out.println(gms/1000 + "kg "+gms%1000 +"gms" );
      //2nd 
        int n=3,sum=0;
       
         for(int i=1;i<=n;i++)
         {
            if(i%2!=0)
            sum+=i;
         }
         System.out.println("sum of odd number is :"+sum);


         //3rd
         int k=9;
        
        for(int i=1;i<=k;i++)
        {
           if(i*i==k)
           {System.out.println(k+ " is the perfect number");
           break;
           }
           else if(i*i>k)
           {System.out.println(k+" is not a perfect number");
            break;
             }
        }

        //4rd
        int rev=123,count=0;
        
       while(rev!=0)
       {
           count=count*10;
        count+=rev%10;
        rev/=10;
       }
       System.out.println("the reversed number is "+count);

       //5th
       int arm=153,arm_value=0;
       k=arm;
       count=0;
       while(k!=0)
       {
        count=k%10;
        arm_value+=count*count*count;
        k=k/10;
       }
       
       if(arm==arm_value)
       System.out.println(arm+ " is the armstrong value ");
       else
       System.out.println(arm+ " is not a armstrong value");


       // 6th
       for(int i=1;i<3;i++)
       {
        for(int j=0;j<i;j++)
         System.out.print(i +" ");
         System.out.print("\n");
       }
         System.out.println("------------------------------");
       //7th
       int py=3;
       int l=2*py-1,j;
       for(int i=1;i<=py;i++)
       {
        for( j=1;j<=l;j++)
          {// if(i==j)
            //System.out.print(j );
            if(l/2==j)
            System.out.print(i);
            else
            System.out.print(" ");
 
           }
         System.out.print("\n");
       }
     
    }
}

