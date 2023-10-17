// package superpaac;
import java.util.*;
public class sample {
   public static void main(String[] args) {
    char x = 'a';
    System.out.println(Character.isDigit(x));
    Scanner obj =new Scanner(System.in);
    String st = obj.next();
    Map<Character,Integer> map = new TreeMap<>();

    for(char ele : st.toCharArray())
    {
        //  map.put(ele, map.getOrDefault(ele,0) + 1);
        map.merge(ele, 1, Integer::sum);
        
    }
    for(Map.Entry<Character,Integer> c:map.entrySet()){
        
        System.out.println(c.getKey()+" "+c.getValue());
    }
    // for(char ele : map.keySet())
    // {
    //     int count = map.get(ele);
    //     for(int i=0;i<count;i++)
    //     {
    //         // map.entrySet();
    //         System.out.print(ele);
    //     }
    // }

   
   } 
}




