package secao17;

import java.io.File;
import java.util.Scanner;

public class FolderApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath); // Cria uma variavel "File" apontando para o caminho digitado
		File [] folders = path.listFiles(File::isDirectory); // Cria um vetor de "File", que recebe uma função lambda que coloca
															// a listagem de pastas dentro do vetor
		
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File [] files = path.listFiles(File::isFile); // Cria outro vetor de "File", só que agora usa uma função para listar
													  // arquivos (::isFile)	
		
		System.out.println("Files: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\Nova Pasta Java").mkdir(); // Concatena com o caminho "Nova Pasta Java", criando
																		  // essa pasta com o método "mkdir()". Esse método 
																		  // retorna "True" caso consiga criar a pasta. 
																		  // Esse retorno é armazenado na variável "success"
		
		System.out.println("Directory created successfully: " + success);
		sc.close();
	}

}
