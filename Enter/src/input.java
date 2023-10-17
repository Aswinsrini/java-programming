import java.net.Socket;
import java.text.NumberFormat.Style;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import java.util.Arrays;

public class input{
   
    public static void main(String[] args)
    {
       Scanner object=new Scanner(System.in);

       
       System.out.println("what is your name ?? ");
       String name =object.nextLine();//string input
       System.out.println("hello "+ name + "!");

       System.out.println("enter the speed limit...");
      int speed=object.nextInt();//integer input
      System.out.println("bike speed is "+speed+ " km/s...");
       
       String  myString= "   hello world !";
       System.out.println(myString.endsWith("!"));
       System.out.println(myString.length());
       System.out.println(myString.toLowerCase());
       System.out.println(myString.toUpperCase());
       System.out.println(myString.indexOf("e"));
       System.out.println(myString.startsWith("hle"));
       System.out.println(myString.trim());

    
    }
}