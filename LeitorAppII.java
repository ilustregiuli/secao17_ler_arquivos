package secao17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorAppII {

	public static void main(String[] args) {
		String path = "C:\\Users\\giuli\\Documents\\workspace\\NelioAlvesCurso\\src\\secao17\\inputTest.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine(); // lê uma linha do arquivo. caso o arquivo esteja no final, retorna "null"
			
			while(line != null) {			//processo de leitura do arquivo. enquanto "line" não for null, imprime
				System.out.println(line);   // a linha e "line" recebe uma nova leitura
				line = br.readLine();
			}
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {						// finally - criado pois se houver um erro na leitura , as streams possam 
			try {						// ser fechadas. Verifica se não é nulo, pois pode ter acontecido erro ao 
				if(br != null) {		// instanciar as variaveis, e se isso ocorreu, não é possível fecha-las.
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
