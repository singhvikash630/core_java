class Demo2
{
	static void test1()
	{
	System.out.println("Test1() method of classA");
	}
	static void test1(int a)
	{
	System.out.println("Test1(int) method of classA");
	}
}
class Demo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo2 d2=new Demo2();
		d2.test1();
		d2.test1(12);
		System.out.println("Program Ends");
	}
}
