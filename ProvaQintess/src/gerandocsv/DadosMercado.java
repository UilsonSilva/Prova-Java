package gerandocsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DadosMercado {
		
	public double preco;  
	public int idPreco;
						
	File arquivoDCSV = new File("D:\\DadosMercado.csv")
	
	
	try {
		String linhasDoArquivoD = new String ();
		
		Scanner leitorda = new Scanner (arquivoDCSV); // ler arquivo dadosMercado
		
		
		while(leitorda.hasNext()) {
			
			linhasDoArquivoD = leitorda.nextLine();
			
			String[] valoresVirgulas = linhasDoArquivoD.split(";");
			
			
						
			//System.out.println(valoresVirgulas [0] +" / "+valoresVirgulas [2]);
			
			//System.out.println(linhasDoArquivoD);
			
		}
				
	}catch(FileNotFoundException e) {
	
	}

	
	
   }	
}
