class genmeth
{
	static <T> void disp(T x)
	{
		System.out.println(x.getClass().getName()+"="+x);
	}
	public static void main(String a[])
	{
		//genmeth g1 = new genmeth();
		disp(11);
		disp(123.456f);
		disp(123.45);
		disp('D');
		disp("Happy");
	}
}