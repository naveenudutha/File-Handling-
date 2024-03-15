package Serialization_Deserialization;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable //In order to support Serialization and Deserialization the must implement the SerialiZable interface
{
	private Integer id;
	private String name;
	private Integer marks;
	public Student() {
		super();
	}
	public Student(Integer id, String name, Integer marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
}

public class SerializationExample {

	public static void main(String[] args) {
		String path="D:\\IOtest";
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		BufferedOutputStream bos=null;
		
		Student s1=new Student(101, "Prashanth", 95);
		
		try
		{
			File f1=new File(path,"StudentMarkSheet.txt");
			fos=new FileOutputStream(f1);
			bos=new BufferedOutputStream(fos);// to speed up the operation we uae BufferedoutputStream
			oos=new ObjectOutputStream(bos);
			//oos=new ObjectOutputStream(fos);
			
			oos.writeObject(s1);
			oos.flush();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		System.out.println("Task completed");

	}

}