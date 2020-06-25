package com.jspider.clone;

class Subject1 {

	  private String name;
	  
	  public Subject1(String s) {
		    name = s;
		  }
	  public String getName() {
	    return name;
	  }
	  public void setName(String s) {
	    name = s;
	  }	  
	}

class Student1 implements Cloneable  {
	  //Contained object
	  private Subject1 subj;
	  private String name;	  
	  public Student1(String name, Subject1 subj) {
			this.name = name;
			this.subj = subj;
		  }
	  public Subject1 getSubj() {
		return subj;
	  }
	  public String getName() {
		return name;
	  }
	  public void setName(String s) {
		name = s;
	  }	  
	  public Object clone() {
		  String name1=subj.getName();
			//Deep copy
		  Subject1 subj=new Subject1(name1);
		  Student1 s = new Student1(name, subj);
			return s;
		  }
	}

public class DeepCopy {	
	public static void main(String[] args) {	
		Subject1 sub=new Subject1("Algebra");
		//Original Object
		Student1 stud = new Student1("vikash", sub);
		//Clone Object
		Student1 clonedStud = (Student1) stud.clone();

		System.out.println("Original Object: " + stud.getName() + " - "	+ stud.getSubj().getName());		
		
		System.out.println("Cloned Object: " + clonedStud.getName() + " - "	+ clonedStud.getSubj().getName());

		stud.setName("sanu");stud.getSubj().setName("math");
		
		System.out.println("Original Object after it is updated: " 	+ stud.getName() + " - " + stud.getSubj().getName());

		System.out.println("Cloned Object after updating original object: "	+ clonedStud.getName() + " - " + clonedStud.getSubj().getName());
	
	}

}
