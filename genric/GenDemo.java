class Gen<T1,T2>
 {
	T1 ob1; // declare an object of type T1
  T2 ob2;
       Gen(T1 o,T2 p) // Pass the constructor a reference to an object of type T1.
      {
         ob1 = o;
         ob2 = p;
      }     
      T1 getob1()  // Return ob1
      {
         return ob1;
      }
      T2 getob2()  // Return ob2
      {
         return ob2;
      }
      void showType() 
      {
          System.out.println("Type of T1 is " + ob1.getClass().getName());
          System.out.println("Type of T2 is " + ob2.getClass().getName());
      }
  }
class GenDemo 
{
  public static void main(String args[])
	{
		Gen<Integer,String> iOb; // Create a Gen reference for Integers
		iOb = new Gen<Integer,String>(3,"abishek");
		iOb.showType();
        int roll = iOb.getob1();
        String name = iOb.getob2();
        System.out.println("Roll no : "+ roll+"\nname: "+name);
        Gen<Integer,String> strOb = new Gen<Integer,String> (50,"gobi");
        strOb.showType();
        roll = strOb.getob1();
        name = strOb.getob2();
        System.out.println("Roll no : "+ roll+"\nname: "+name);
    }
}
