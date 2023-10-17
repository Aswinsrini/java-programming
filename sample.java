import java.util.*;
class person
{
    String name;
    person(String name)
    {
        this.name=name;
    }
    public boolean equals(Object p)
    {
        return ((person)p).name==this.name;
    }
    // public int hashCode()
    // {
    //     return name.length();
    // }
}
class sample
{
    public static void main(String[] args) {
        Map<person,String>a=new HashMap<person,String>();
        a.put(new person("jack"),"12");
        a.put(new person("jack"),"13");
        a.put(new person("aswin"),"11");
        System.out.println(a.size());
    }
}