package com.jspider.objectclass;

public class Demo6
{
	int i;
	@Override
	public String toString()
	{
		return "vikash";
		
	}
   public static void main(String[] args)
	{
	   try{
		   
	   }
	   catch(Exception e){}
		System.out.println("program starts");
		Demo6 d6=new Demo6();
		Demo6 d7=new Demo6();
		System.out.println(d6==d7);
		System.out.println(d7);
		System.out.println(d6.toString()==d7.toString());
	}

}
