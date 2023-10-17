import java.util.*;

public class map {
    public static void main(String[] args) {
        HashSet<Integer>p=new HashSet<>();
        p.add(2);
        p.add(1);
        System.out.print(p);
        var a=new int[8];
        LinkedHashMap<Integer,String> hash=new LinkedHashMap<>();
       hash.put(1, "Aswin");
       hash.put(2, "john");
       hash.put(3, "messi");
       hash.put(4, "ronaldo");
       hash.put(5, "james");

    for(Map.Entry i: hash.entrySet())//to display the all the elemnts in the hashmap
       System.out.println(i.getKey()+" "+i.getValue());

       hash.replace(2, "william");//to replace the value in the key
       hash.remove(3);//to remove the particular key in the hash
       hash.clear();//to clear the all the elements in the hashmap
       System.out.println(hash); 
    }
}
