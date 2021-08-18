package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {
	
	public static void createFile()
	{
		File f = new File("C:/Users/sneha/Downloads/Sample.txt");
		try {
			boolean b = f.createNewFile();
			if(b)
			{
				System.out.println("File is created......");
			}
			else
			{
				System.out.println("File already exists!!!!!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Using FileOutputStream
	public static void createFileUsingFOS() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name with location path");
		String filename = sc.nextLine();
		
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			System.out.println("Enter the content of the file");
			String content = sc.nextLine();
			byte b[] = content.getBytes();
			
			fos.write(b);
			fos.close();
			System.out.println("File is saved on the given location....");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
	public static void createFileUsingJavaNIOUtility()
	{
		
		Path filename = Paths.get("C:/Users/sneha/Downloads/Sample4.txt");
		try {
			Path pathname = Files.createFile(filename);
			System.out.println("File is created at "+filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//createFile();
		
		//createFileUsingFOS();
		
		createFileUsingJavaNIOUtility();
	}

}
