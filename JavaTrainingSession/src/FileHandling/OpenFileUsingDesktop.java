package FileHandling;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFileUsingDesktop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String pathname = "C:/Users/sneha/Downloads/Sample.txt";
		
		File f = new File(pathname);
		if(!Desktop.isDesktopSupported())
		{
			System.out.println("Desktop not supported");
		}
		
		Desktop desktop = Desktop.getDesktop();
		
		if(f.exists())
		{
			try {
				desktop.open(f);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
