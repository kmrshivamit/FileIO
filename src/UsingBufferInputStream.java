import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingBufferInputStream {

	public static void main(String[] args) {
		File file1 = new File("Shivam.txt");
		File file2 = new File("Rahul.txt");
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		FileOutputStream fos=null;

		try {
			if (!file2.exists())
				file2.createNewFile();
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);	
			fos=new FileOutputStream(file2);
			while (bis.available() > 0) {
				char c=(char) bis.read();
				fos.write((byte)c);
				System.out.print(c);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
