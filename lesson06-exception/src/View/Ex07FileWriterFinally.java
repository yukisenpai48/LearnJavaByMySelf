package View;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07FileWriterFinally {
	public static void main(String[] args) {
		File file = createFile("data.txt");

		writeFile(file);

		System.out.println("Finished ...");
	}

	private static boolean writeFile(File file) {
		FileWriter fw = null;
		try {
			// open file
			 fw = new FileWriter(file);

			// write file
			fw.write("Item 01\n");
			fw.write("Item 02\n");
			fw.write("Item 03\n");
			fw.write("Item 04\n");
			// .......
			fw.write("Item k - 1\n");
			fw.write(5 / 0); // error happend
			fw.write("Item k\n");
			// ......
			fw.write("Item 998\n");
			fw.write("Item 999\n");

			// save and close
			// fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(fw);
		}
		return true;
	}
	
	private static void close(FileWriter fw) {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static File createFile(String pathName) {
		File file = new File(pathName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}
}
