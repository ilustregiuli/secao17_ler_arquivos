package secao17;

import java.io.File;
import java.util.Scanner;

public class FolderInformationApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		System.out.println("Nome do arquivo: " + path.getName()); // getName : retorna somente o nome do arquivo
		System.out.println("Caminho do arquivo (somente caminho): " + path.getParent()); // getParent : retorna somente o caminho
		System.out.println("Caminho completo do arquivo: " + path.getPath());  // getPath: retorna o caminho completo
		
		sc.close();

	}

}
