package builshop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class DataReader {

	public static String[] readData(String path) {
		String data = "";
		try {
			data = new String(Files.readAllBytes(Paths.get(path)));
		} catch (IOException e) {
			System.out.println("File not found");
		}
		return data.split("-----");
	}

	public static void writeData(String file, String data) {
		try {
			Files.write(Paths.get(file), data.getBytes(), StandardOpenOption.CREATE);
			System.out.println("File created");
		} catch (IOException e) {
			System.out.println("File not created");
		}

	}

}
