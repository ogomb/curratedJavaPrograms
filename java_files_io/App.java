import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Make sure that the file test.txt exists the contents of it will
 * be copied to copy.txt, if it does not exist it will be created automatically for you.
 * This file will be created in the folder that you are in while running this program.
 * The needed file also needs to be in the current working folder.
 */

public class App {
	public static void main(String[] args) {
		File file = new File("test.txt");
		File file2 = new File("copy.txt");
		try (
				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				bufferedWriter.write(line);
				bufferedWriter.write("\n");
			}

		} catch (FileNotFoundException e) {
			System.out.println("Can't find file " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}

	}
}
