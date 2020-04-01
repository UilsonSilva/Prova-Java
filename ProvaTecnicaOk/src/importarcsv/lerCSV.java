package importarcsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lerCSV {

	public static void main(String[] args) {
		
		File arquivoOCSV = new File("D:\\Operacoes.csv");// caminho do arquivo
		
		try {
			String linhasDoArquivoO = new String ();
			
			Scanner leitorop = new Scanner (arquivoOCSV);
			
			
			while(leitorop.hasNext()) {
				
				linhasDoArquivoO = leitorop.nextLine();
				
				String[] valoresVirgulas = linhasDoArquivoO.split(";");
				
				System.out.println(valoresVirgulas [0] +" / "+valoresVirgulas [12]+" / "+valoresVirgulas [13]);//saída 
							
			}
					
		}catch(FileNotFoundException e) {
		
		}
	
		File arquivoDCSV = new File("D:\\DadosMercado.csv");
				
				try {
					String linhasDoArquivoD = new String ();
					
					Scanner leitorda = new Scanner (arquivoDCSV);
					
					
					while(leitorda.hasNext()) {
						
						linhasDoArquivoD = leitorda.nextLine();
						
						String[] valoresVirgulas = linhasDoArquivoD.split(";");
						
						System.out.println(valoresVirgulas [0] +" / "+valoresVirgulas [2]);
						
						System.out.println(linhasDoArquivoD);
						
					}
							
				}catch(FileNotFoundException e) {
				
				}
		
	
	
	
	
	
	
	
	}	
				
			
}