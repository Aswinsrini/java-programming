
import java.util.*;
class array
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        Map <Integer,String> hash=new HashMap<>();
        hash.put(1, "aswin");
        hash.put(2, "john");
        hash.put(3, "vicky");
        hash.put(4, "vicky");
        // hash.put(1, "");
        for(Map.Entry i : hash.entrySet())
        {
            if( i.getValue()=="aswin")
            System.out.println(i.getKey()+"  "+i.getValue());
        }
        

       
        // Map <Character,Integer> sri=new TreeMap<>();
        // for(char ch:obj.next().toCharArray())
        //     sri.merge(ch,1,Integer::sum);
        // System.out.println(sri);




        // int [] a = {12,42,2,21,21,323,1};
        // Arrays.sort(a);
        // List<Integer>l =(Arrays.asList(Arrays.stream(a).boxed().toArray(Integer[]::new)));
        // // for(Integer i:a)
        // Collections.sort(l);
        // Collections.reverse(l);
        // System.out.println(l);
        // // System.out.println(l.stream().reduce(0,Integer::sum));

      
        
    }
}