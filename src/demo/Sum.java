package demo;

public class Sum {
	public int Sum(int x, int y)
	{
		return (x + y);
		
	}
	public int Sum(int x, int y, int z)
	{
		return (x + y + z);
		
	}
	public double Sum(double x, double y)
	{
		return (x + y);
	}
	public static void main(String args[])
	{
		Sum s = new Sum();
		System.out.println(s.Sum(20,30));
		System.out.println(s.Sum(60,50,40));
		System.out.println(s.Sum(10.5,20.5));
}

}
