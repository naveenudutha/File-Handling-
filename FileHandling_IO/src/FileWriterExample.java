import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		
		String path1="D:\\IOtest";
		
		FileWriter fw=null;
		
		try
		{
			File directory=new File(path1);
			File file=new File(directory,"sample.txt");
			fw=new FileWriter(file);
			
			fw.write("Naveen");
			fw.write("\n");//writing new line o file
			fw.write('U');
			fw.write("\n");
			fw.write(97);//it will not write 97 , instead it will write character 'a' based on ascii value
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}