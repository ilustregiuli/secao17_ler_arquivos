package secao17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeitorApp {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\giuli\\Documents\\workspace\\NelioAlvesCurso\\src\\secao17\\inputTest.txt");
		Scanner sc = null;
		try {
			
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}
