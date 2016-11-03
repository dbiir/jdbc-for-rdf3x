package cn.edu.ruc.iir.jdbc43x;

public class Test<T>
{
	public static String a = "";
	
	public void f(T b)
	{
		System.out.println(b.getClass().toString());
		System.out.println(a);
	}
}
