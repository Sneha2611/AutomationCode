package FileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFilesFolders {

	
	public static void printFiles()
	{
		
		File f = new File("C:/Users/sneha/Downloads");
		File[] arrOfFiles = f.listFiles();
		
		Arrays.sort(arrOfFiles);
		
		
		
		for(File i : arrOfFiles)
		{
			
			if(i.isFile())
			{
				System.out.println("File : "+i.getName());
				
			}
			
			
			else if(i.isDirectory())
			{
				System.out.println("Directory : "+i.getName());
			}
			else
			{
				System.out.println("No known : "+i.getName());
			}
			
			
		}
		
		
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
printFiles();
	}

}
