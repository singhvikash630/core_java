package java.jspider.typecasting1;
class Demo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//homogeneous assignments
		int i=10;
		double d=12.23;
		System.out.println("i="+i);
		System.out.println("d="+d);
		System.out.println("**********************");
		double b=i;           //auto widening
        System.out.println("b="+b);
		int j=(int)d;         //explicit narrowing
		System.out.println("j="+j);
		System.out.println("Program Ends");
	}
}
