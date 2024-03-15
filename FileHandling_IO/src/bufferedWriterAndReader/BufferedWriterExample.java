package bufferedWriterAndReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {
		String path1="D:\\IOtest";
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try
		{
			File directory=new File(path1);
			File file=new File(directory,"alien.txt");
			fw=new FileWriter(file);
			
			bw=new BufferedWriter(fw);
			
			
			
			bw.write("Naveen");
			bw.newLine();
			bw.write('U');
			bw.newLine();
			bw.write(97);
			bw.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try {
				bw.close();
				fw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	}


