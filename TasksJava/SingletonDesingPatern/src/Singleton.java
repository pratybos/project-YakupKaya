public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton(){}
	public static Singleton NewObject()
	{
		if (singleton==null)
		{
			singleton=new Singleton();
		}
		return singleton;
	}
	
	
public double Addition(int x, int y)
{
	return (x+y);
}
public double Subtraction(int x, int y)
{
	return (x-y);
}
public double Multiplication(int x, int y)
{
	return (x*y);
}
public double Division(int x, int y)
{
	return (x/y); //don't care about x/0
}
}
