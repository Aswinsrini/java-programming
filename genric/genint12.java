interface MinMax<T> 
{
	T min();
	T max();
}
// Now, implement MinMax
class MyClass<T> implements MinMax <T>
{
	T[] vals;
	MyClass(T[] o) 
	{ 
		vals = o; 
	}
// Return the minimum value in vals.
	public T min()
	{
		T v = vals[0];
		for(int i=1; i < vals.length; i++)
			if(vals[i] < v) 
				v = vals[i];
		return v;
	}
// Return the maximum value in vals.
	public T max()
	{
		T v = vals[0];
		for(int i=1; i < vals.length; i++)
			if(vals[i] > v) 
				v = vals[i];
			return v;
	}
}
class genint12
{
	l.public static void main(String args[])
	{
		Integer inums[] = {3, 6, 2, 8, 6 };
		Character chs[] = {'b', 'r', 'p', 'w' };
		MyClass<Integer> iob = new MyClass<Integer>(inums);
		MyClass<Character> cob = new MyClass<Character>(chs);
		System.out.println("Max value in inums: " + iob.max());
		System.out.println("Min value in inums: " + iob.min());
		System.out.println("Max value in chs: " + cob.max());
		System.out.println("Min value in chs: " + cob.min());
	}
}