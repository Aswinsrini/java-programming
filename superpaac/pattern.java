// package superpaac;
import java.util.Scanner;

public class pattern {
    public static void main(String []as)
    {
        Scanner obj = new Scanner(System.in);
        int n= 5;
        
        for(int i=0;i<n;i++)
        {
            int ch =65;
            for(int j=i;j<2*n-i-1;j++)
            System.out.print(" ");
            
            for(int j=0;j<=i;j++)
            {
                System.out.printf("%c ",ch);
                ch++;
            }
            ch--;
            while(ch!=65)
            {
                ch--;
                System.out.printf("%c ",ch);
            }
            System.out.println();
        }
    }
} 
