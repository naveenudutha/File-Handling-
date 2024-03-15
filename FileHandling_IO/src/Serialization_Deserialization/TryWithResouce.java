package Serialization_Deserialization;
//important pints
//try with resoueces is a concept where we don't need to close the resources explicitly
//it will be achieved by implementing the AutoClosable interface which has close method.
//bydefault try with resources concept using this AutoClosable feature

// for example create a custom class and implement the AutoClosable interface and override the close method. 
//and try use this class as a resource in try and see. automatically the close method statements will be executed

import java.io.FileOutputStream;

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

public class TryWithResouce {

	public static void main(String[] args) {

		
		Student s1=new Student(102, "Ravi", 95);
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\IOtest\\StudentTryWithResource.txt")))
		{
		
			oos.writeObject(s1);
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

			//if we are using try with resource we no need to close any resouces

		System.out.println("Task completed");

	}

}


