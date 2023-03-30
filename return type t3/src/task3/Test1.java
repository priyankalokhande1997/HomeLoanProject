package task3;

public class Test1 {
public double m4(double a, double b)
{
	double c= a/b;
	return c;
}
public float m5(float p, float q)
{
	float d= p+q;
	return d;

}
public char m6(char x)
{
	char e= x;
	return e;

}
public static void main(String args[])
{
	Test1 r= new Test1();
	double c= r.m4(44.3,77.999);
	float d= r.m5(333.3f,888.3f);
	char e= r.m6('o');
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);

	
	
}
}
