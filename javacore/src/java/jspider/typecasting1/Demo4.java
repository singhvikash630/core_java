package java.jspider.typecasting1;
class Demo4 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		int i=12;
		short s=(short)(double)(float)(int)(long)i;
		System.out.println("i="+i);
		System.out.println("s="+s);
		System.out.println("Program Ends");
	}
}
