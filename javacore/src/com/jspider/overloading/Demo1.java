class Demo1 
{
	int x;double y;
	static int square(int a)
	{
	x=a*a;
	return x;
	}
	double square(double d)
	{
	y=d*d;
	return y;
	}
	public static void main(String[] args) 
	{
		System.out.println("Program Starts..");
		Demo1 d34=new Demo1();
		d34.square(5);
		d34.square(10.5);
        System.out.println("Square of a="+d34.x);
		System.out.println("Square of d="+d34.y);
		System.out.println("Program Ends..");
	}
}
