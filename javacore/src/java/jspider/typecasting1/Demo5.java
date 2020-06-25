package java.jspider.typecasting1;
class Demo5
{
	static double test1(int i)
	{
     System.out.println("inside test1()");
     System.out.println("i="+i);
	 return ++i;	
	}
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		int j=(int)test1((int)34.21);
         System.out.println("j="+j);
		 System.out.println("Program Ends");
	}
}
