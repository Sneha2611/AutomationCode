package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	
	public static void copyFile() throws IOException
	{
		
		File ipfile = new File("C:/Users/sneha/Downloads/Appointment_slip.pdf");
		File opfile = new File("C:/Users/sneha/Downloads/New_Appointment_slip.pdf");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(ipfile);
			fos = new FileOutputStream(opfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(fis.available());
		
		int i = 0;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		
		if(fis != null)
		{
			fis.close();
		}
		
		if(fos != null)
		{
			fos.close();
		}
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		copyFile();
		
		
	}

}
