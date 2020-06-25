package java.jspider.typecasting1;
class Demo6
{
	static int test1(double i)
	{
     System.out.println("inside test1()");
     System.out.println("i="+i);
	 return (int)i;	
	}
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		int j=Demo6.test1(34.21);
         System.out.println("j="+j);
		 System.out.println("Program Ends");
	}
}
