weeoooooooo0fdqwwapackage com.jspider.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class HuMan11  { 	  

	String gender="female";   
	HuMan11(){
		System.out.println("super class");
	}
}

class Man1 extends HuMan11 implements Serializable{  
	 String name="ram";
	 Man1(){
		 System.out.println("sub class");
	 }
} 
public class SubSerialSuperNotSerial {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Man1 Man1= new Man1();
		
		FileOutputStream fos=new FileOutputStream("emp.ser");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(Man1);
		
		FileInputStream fileInputStream = new FileInputStream("emp.ser");  
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);  
		Man1 Man1out = (Man1) inputStream.readObject(); 
		/* 
		 * Printing values from deserialized Man1's object 
		 */  
		System.out.println("Printing value of Deserailized Man1's instance :");  
		System.out.println("Gender: " + Man1out.gender);  		   
		System.out.println("Name: " + Man1out.name);  


	}

}
