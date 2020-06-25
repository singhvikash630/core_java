//Overrides the method of Object Class

package com.jspider.objectclass;
class A
{
/*public String toString()
{
System.out.println("Override method of Object Class");	
return "vikash";
}*/
}
public class Demo1

{

	public static void main(String[] args)
	{
		System.out.println("program Starts");
		A a1=new A();
		A a2=new A();
		System.out.println(a1);//implicit call to toString() method of Object Class
		System.out.println(a2);
		System.out.println(a1==a2);//false
		System.out.println(a1.toString()==a2.toString());//false
		//System.out.println(a1.toString());//Explicit call to toString() method of Object Class
		//System.out.println(a1.hashCode());
		System.out.println("program Ends");
		
	}

}
