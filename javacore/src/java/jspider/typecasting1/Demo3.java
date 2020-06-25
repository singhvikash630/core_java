package java.jspider.typecasting1;
class Demo3 
{
	static void test1(int a)
	{
	System.out.println("i="+a);

	}
	public static void main(String[] args) 
	{
		System.out.println("Programs Starts");
        Demo3.test1((int)12.23);
		System.out.println("Programs Ends");
	}
}
