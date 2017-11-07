import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile {

	public CountriesTextFile() {
		// TODO Auto-generated constructor stub
	}

	public static void writeToFile(String userInput) {
		Path writeFile = Paths.get("countries.txt");
		File file = writeFile.toFile();

		try {
			// the true parameter in the FileOutputSteam constructor allows us to append to
			// the
			// end of the document, otherwise false will overwrite the entire document
			PrintWriter out = new PrintWriter(new FileOutputStream(file, true));
			out.println(userInput);
			System.out.println("This country has been saved!");
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found here!");
			// e.printStackTrace();
		}
	}

	public static void readToFile() {
		Path writeFile = Paths.get("countries.txt");
		File file = writeFile.toFile();

		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
			if (line == null) {
				
			}

		} catch (IOException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}

	}

}
