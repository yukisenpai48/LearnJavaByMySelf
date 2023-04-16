package View;

import java.io.File;
import java.io.IOException;

public class Ex03FileCreator {
	public static void main(String[] args) {
		try {
			boolean isSuccess = createFile("readme.txt");
			System.out.println("isSuccess: " + isSuccess);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("finished...");
	}
	
	private static boolean createFile(String pathName) throws IOException {
		File file = new File(pathName);
		return file.createNewFile();
	}
}
