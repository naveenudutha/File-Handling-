package bufferedWriterAndReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		
		String path1="D:\\IOtest";
		
		FileReader fr=null;
		BufferedReader br=null;
		
		try
		{
			File directory=new File(path1);

			File file=new File(directory,"alien.txt");
			
			fr=new FileReader(file);
			
			br=new BufferedReader(fr);
			String s=br.readLine();
			
			while(s!=null)//once file reaching the end of the data it will return null value
			{
				System.out.println(s);
				s=br.readLine();
			}
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		

	}

}