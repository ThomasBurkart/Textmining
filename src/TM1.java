import java.nio.file.*;
import java.util.List;
import java.io.*;

public class TM1 {
	public static void main(String[] args) {
		try {
			List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\lpr_000\\workspace\\Textmining 1\\src\\error.txt"));
			for(String line : lines) {
		        System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
