package java.jspider.typecasting1;
class Demo1
{
	static int a=10;
	static double d;
	static byte b;
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		d=a;//type casting
		b=(byte)a;//type conversion
		byte c=(byte)((byte)b+(byte)b);
		System.out.println("value of d="+Demo1.d);
        System.out.println("value of b="+Demo1.b);
        System.out.println("c="+c);
		System.out.println("Program Ends");
	}
}
