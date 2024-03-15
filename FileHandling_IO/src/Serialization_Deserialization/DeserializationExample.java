package Serialization_Deserialization;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis1=new FileInputStream("D:\\IOtest\\StudentMarkSheet.txt");
		
		ObjectInputStream ois1=new ObjectInputStream(fis1);
		
		Student student1 = (Student)ois1.readObject();
		System.out.println(student1);

		//to speed up the operation and reduce the no of hard disc hits we use BufferedInputStream
		
		FileInputStream fis2=new FileInputStream("D:\\IOtest\\StudentMarkSheet.txt");
		BufferedInputStream bis=new BufferedInputStream(fis2);
		ObjectInputStream ois2=new ObjectInputStream(bis);
		
		System.out.println("--------------------------------------");
		Student student2 = (Student)ois2.readObject();
		System.out.println(student2);
		
	}

}
