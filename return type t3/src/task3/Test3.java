package task3;

public class Test3 {
	String s1;
	String s2;

	public String m2()
	{
		return s1;
	}
	public String m1()
	{
		return s2;
	}
public static void main(String args[])
	{
		Test3 t= new Test3();
				t.s1="Priyanka";
				t.s2="Lokhande";
				String s1= t.m2();		
				String s2= t.m1();
		System.out.println(s1);
		System.out.println(s2);
	}
		
	

}
