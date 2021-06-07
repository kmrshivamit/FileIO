import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedReader {
	public static void main(String[] args) {
		File file1 = new File("Shubham.txt");
		File file2 = new File("Gaurav.txt");
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		
		try {

			if (!file2.exists())
				file2.createNewFile();
			fw = new FileWriter(file2);
			fr = new FileReader(file1);
			br = new BufferedReader(fr);

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				fw.write(line);
				line = br.readLine();
				fw.flush();
		
			}
			
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
