package com.jspider.clone;

class Subject {

	  private String name;
	  
	  public Subject(String s) {
		    name = s;
		  }
	  public String getName() {
	    return name;
	  }
	  public void setName(String s) {
	    name = s;
	  }	  
	}

class Student implements Cloneable  {
	  //Contained object
	  private Subject subj;
	  private String name;	  
	  public Student(String s, Subject subj) {
			name = s;
			this.subj = subj;
		  }
	  public Subject getSubj() {
		return subj;
	  }
	  public String getName() {
		return name;
	  }
	  public void setName(String s) {
		name = s;
	  }	  
	  public Object clone() throws CloneNotSupportedException {
			//shallow copy
			
			  return super.clone();
			
		  }
	}

public class ShallowCopy {	
	public static void main(String[] args) throws CloneNotSupportedException {	
		Subject sub=new Subject("Algebra");
		//Original Object
		Student stud = new Student("John", sub);
		//Clone Object
		Student clonedStud = (Student) stud.clone();

		System.out.println("Original Object: " + stud.getName() + " - "	+ stud.getSubj().getName());		
		
		System.out.println("Cloned Object: " + clonedStud.getName() + " - "	+ clonedStud.getSubj().getName());

		stud.setName("vash");stud.getSubj().setName("math");
		
		System.out.println("Original Object after it is updated: " 	+ stud.getName() + " - " + stud.getSubj().getName());

		System.out.println("Cloned Object after updating original object: "	+ clonedStud.getName() + " - " + clonedStud.getSubj().getName());
	
	}

}
