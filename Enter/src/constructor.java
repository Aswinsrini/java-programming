// // 3 types of constructor
// class conc{  // constructor has the same name of class
//   private  int length,width;
//    public  conc()//default constructor
//     {
//      length=2;
//      width=5;
//     }
//     public conc(int a,int b)//parameterised constructor 
//     {
//        this.length=a;
//         this.width=b;
//     }
//     public conc (int a)
//     {
//         length=width=a;
//     }
//     public conc(conc o2)// copy constructor - constructor is copied from one object to another object
//     {
//         length=o2.length;
//         width=o2.width;
//     }

//     int area()
//     {
//         return length*width;
//     }
// }
// public class constructor {
//     public static void main(String[] args) {

//     conc o=new conc();
//     System.out.println("area : "+o.area());

//     conc o1 =new conc(4,5);
//     System.out.println("area : "+o1.area());

//     conc o2 =new conc(9);
//     System.out.println("area : "+o2.area());

//     conc o3=new conc(o2);
//     System.out.println("area : "+o3.area());
//     }
// }




//arrays of objects

class student{
    public int roll;
    public String name;

    student(int roll,String name)
    {
     this.roll=roll;
     this.name =name;
    }
    void print()
    {
        System.out.println("name : "+name);
        System.out.println("rollno : "+roll);
        System.out.println("-------------------------");
    }
}
public class constructor{
public static void main(String[] args){
   student[] o;//declaration
    o= new student[5];
   o[0]=new student (12, "arun");
   o[1]=new student (11, "james");
   o[2]=new student (10, "bond");
   o[3]=new student (8, "elon");
}
}