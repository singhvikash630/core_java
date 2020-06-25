
//Comparator used for sorting the object inside the derived array using multiple values
package com.jspider.comparableandcomparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class A
{
	int i;String j;
	A(int i,String j)
	{
		this.i=i;this.j=j;
	}
	public String toString()
	{
		return "("+i+","+j+")";
	}
}
class SortByI implements Comparator
    {
     public int compare(Object obj1,Object obj2)	
       {
	   return ((A)obj1).i-((A)obj2).i;
       }
    }
class SortByJ implements Comparator
{
 public int compare(Object obj1,Object obj2)	
   {
   return (((A)obj1).j).compareTo(((A)obj2).j);
   }
}

class Demo2
{
	public static void main(String[] args) 
	{
	System.out.println("program starts");
	A[] array1={new A(15,"vash"),new A(12,"sssss"),new A(10,"vvvv"),new A(33,"bbbb"),new A(22,"bbbb")};
	List<Integer> list=Arrays.asList(10,2,3,1,5);
	System.out.println("before sorting");
	for(A arr:array1)
	{
		System.out.println(arr);
	}
	Comparator<Integer> comp=(x,y)-> (x<y)?-1:(x>y)?1:0;
	Collections.sort(list,comp);
	System.out.println("after sorting list:"+list);
	
	Arrays.sort(array1,new SortByJ());
	System.out.println("after sorting");
	for(A arr:array1)
	{
		System.out.println(arr);
	}
	System.out.println("program ends");
	}
	
	
	}
