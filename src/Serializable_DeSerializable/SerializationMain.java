package Serializable_DeSerializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee(101,"Shivam","Cloud");
		Employee emp2=new Employee(102,"Rahul","Python");
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			 fos=new FileOutputStream("Employee.txt");
			 oos=new ObjectOutputStream(fos);
			 oos.writeObject(emp1);
			 oos.writeObject(emp2);
			 oos.writeObject(null);
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
