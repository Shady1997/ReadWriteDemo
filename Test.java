import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		FileReader fr;
		FileWriter fw;
		try {
			fw = new FileWriter(System.getProperty("user.dir") + "\\testout.txt");
			fw.write("Welcome to Idemia Egypt.");
			fw.close();
			fr = new FileReader(System.getProperty("user.dir") + "\\testout.txt");
			int i;
			while ((i = fr.read()) != -1)
				System.out.print((char) i);
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
