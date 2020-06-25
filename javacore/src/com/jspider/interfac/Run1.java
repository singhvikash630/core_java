package com.jspider.interfac;

//Multiple Interface
class Student
{
	int rollno;
	int getNumber(int n)
	{
	rollno=n;
	return rollno;
	}
	void putNumber()
	{
		System.out.println("Rollno="+rollno);
	}
}
class test extends Student
{
	int marks[]=new int[5];
	void getMarks(int m[])
	{
	for(int i=0;i<marks.length;i++)
		marks[i]=m[i];
	}
	void putMarks()
	{
	for(int i=0;i<marks.length;i++)
        System.out.println("Marks["+i+"]"+marks[i]);
	}
}
interface IAMarks
{
	int Ia1=25;int Ia2=45;
	void putIa();
}
class Results extends test implements IAMarks
{
	public void putIa()
	{
	 System.out.println("Ia1="+Ia1+"Ia2="+Ia2);
	}
	void display()
	{
		int total=0;
		for(int i=0;i<marks.length;i++)
			total=total+marks[i];
		putNumber();
		putMarks();
		putIa();
        System.out.println("Total Marks="+total);
	}
}
class Run1
{ 
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40,50};
		System.out.println("Program Starts");
		Results s1=new Results();
		s1.getNumber(100);
		s1.getMarks(a);
		s1.display();
		System.out.println("Program Ends");
	}
}
