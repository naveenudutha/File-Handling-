import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchFileReader {

	public static void main(String[] args) {
		
		FileReader fr=null;
		String path1="D:\\IOtest";
		
		try
		{
			File directory=new File(path1);
			File file=new File(directory,"sample.txt");
			
			fr=new FileReader(file);
			//reading data character by character . i this case hard disc hits are more
			int i=fr.read();
			while(i!=-1)//when file reaching its end of the data it will return-1
			{
				System.out.print((char)i);
				i=fr.read();//reading next character
			}
			
			//we can also 
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
