import java.io.File;
import java.io.IOException;

public class LaunchFile {
	
	public static void main(String args[])
	{
		
		
		File f1=new File("D:\\IOtest\\bye.txt");
		File f2=new File("D:\\IOtest\\sample.txt");
		System.out.println(f1.exists());//to check an file exist or not 
		System.out.println(f2.exists());
		
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(f2.exists());
		
		String path1="D:\\IOtest\\Java";
		File f3=new File(path1);
		//to check whether a f2 is referring folder or file we use isFile() or isDirectory()
		
		System.out.println("Is File : "+f3.isFile());//false
		System.out.println("Is Directory : "+f3.isDirectory());//false if we dont have the folder
		System.out.println("-----------------------------------------");
		
		//we can create a folder/directory using method mkdir()
		
		System.out.println("creating folder : "+f3.mkdir());
		
		System.out.println("if f3 folder : "+f3.isDirectory());
		
		//to get list of files in a directory we can use list() method, it will return String array containing all the file names
		System.out.println("---------------------------------------------------");
		File directory=new File("D:\\IOtest");
		String ar[]=directory.list();
		for(String fileName:ar)
			System.out.println(fileName);
	}
	

}