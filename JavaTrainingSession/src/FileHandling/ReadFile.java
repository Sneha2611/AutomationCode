package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
	
	String pathname = "C:/Users/sneha/Downloads/Sample.txt";
	
	//1.Read file using FileInputStream
	public void readUsingFIS() throws IOException
	{
		
		//File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(pathname);
			
			int i=0;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			fis.close();
		}
	}
	
	//--------------------------------------------------------------------------
	
	
	
	//2.Read file using BufferedReader
	public void readUsingBR() throws IOException
	{
		
		BufferedReader br =null;
		try {
			br = new BufferedReader(new FileReader(pathname));
			
			int c = 0;
			while((c=br.read())!=-1)
			{
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			br.close();
		}
	}
	//--------------------------------------------------------------------------------------------------
	
	//3.Read file using FileReader
	
	public void readUsingFileReader() throws IOException
	{
		try {
			FileReader fr = new FileReader(pathname);
			
			int e = 0;
			while((e=fr.read())!=-1)
			{
				System.out.print((char)e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//4.Read file using scanner
	
	public void readUsingScanner()
	{
		File f =new File(pathname);
		Scanner sc;
		try {
			sc = new Scanner(f);
			
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	//5.Read file using NIO
		
	public void readUsingNio()
	{
		
		try {
			List<String> l = Files.readAllLines(Paths.get(pathname), StandardCharsets.UTF_8);
			
			Iterator<String> itr = l.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		ReadFile r = new ReadFile();
		
		//r.readUsingFIS();
		//r.readUsingBR();
		//r.readUsingFileReader();
		//r.readUsingScanner();
		r.readUsingNio();
	}

}
