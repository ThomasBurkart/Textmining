import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TM2 {

	public static void main(String[] args) {
		
		HashSet<HashSet<String>> content = readContent("C:\\HdM\\6. Semester\\Textmining\\Textmining\\src\\TXT\\historical\\The First Part of King Henry VI.txt");
		
		
	}
	
	private static HashSet<HashSet<String>> readContent(String path){
		HashSet<HashSet<String>> result = new HashSet<HashSet<String>>();
		try {
			BufferedReader reader = Files.newBufferedReader(Paths.get(path), StandardCharsets.UTF_16LE);
			
			int i = 0;
			String line = reader.readLine();
			String tagStart = "^<([^/a-z]+)>";
			Pattern pattern = Pattern.compile(tagStart);
			while(line != null) {
				System.out.println("Line " + i + ": " + line);
				Matcher m = pattern.matcher(line);
				
				if (m.find()) {
//					
							System.out.println("Line " + i + ": match -> '" +  m.group(1) + "'");
						
					
					
				}
				
				
				line = reader.readLine();
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
