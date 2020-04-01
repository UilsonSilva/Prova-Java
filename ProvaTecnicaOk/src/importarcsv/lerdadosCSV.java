package importarcsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lerdadosCSV {

	//File arquivoOCSV = new File("D:\\Operacoes.csv");
	
	File arquivoDCSV = new File("D:\\DadosMercado.csv");
	
	try {
		String linhasDoArquivoD = new String ();
		
		//Scanner leitorop = new Scanner (arquivoOCSV);
		Scanner leitorda = new Scanner (arquivoDCSV);
		
		while(leitorda.hasNext()) {
			
			linhasDoArquivoD = leitorop.nextLine();
			
			System.out.println(linhasDoArquivoD);
			
		}
				
	}catch(FileNotFoundException e) {
	
	}

	
	
}
