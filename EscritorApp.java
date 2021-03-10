package secao17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorApp {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "C:\\Users\\giuli\\Documents\\workspace\\NelioAlvesCurso\\src\\secao17\\outputTest.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {  
			// "FileWriter" com somente UM parâmetro, cria o arquivo se não existir e SE existir, recria novamente.
			// Já com DOIS parâmetros, cria o arquivo se não existir e SE existir, mantém o arquivo e acrescenta as novas
			// escritas no final do arquivo.
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
