package intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFiles {

	public static void main(String[] args){
		
		
		String filePath = "C:\\F\\Zeenat_\\UMBC\\MS_Study\\Job preparation\\readFile1.txt";
		File file = new File(filePath);
		Scanner schedule;
		try {
			schedule = new Scanner(file);
		
		while(schedule.hasNextLine()){
			String line = schedule.nextLine();
			System.out.println(line);
		}
		schedule.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found" + file.toString());
		}
		

	}

}
