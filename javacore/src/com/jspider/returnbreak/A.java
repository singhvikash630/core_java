package com.jspider.returnbreak;
public class A 
{
	static int x,y;
	  public static void main(String[] args) 
	{
		for(int z=0;z<=4;z++)
		{
			x++;
			System.out.println("x="+x);
			if(z==2)break;
			y++;
			System.out.println("y="+y);
		}
		System.out.println(x+","+y);
		}

}
