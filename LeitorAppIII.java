package secao17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorAppIII {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\giuli\\Documents\\workspace\\NelioAlvesCurso\\src\\secao17\\inputTest.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			// "try-with-resources" declara dessa forma um BuferredReader e passa no argumento a instanciação de um
			// new FileReader com a variável "path" como argumento. Sendo assim, não será necessário o bloco "finally"
			// para fechar esses "streams"
			
			String line = br.readLine();
			
			while(line != null) {			
				System.out.println(line);   
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		
	}

}
