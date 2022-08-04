package classes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Info {
	
	/**
	 * M�todo dados, retorna as informa��s sobre o computador e o sistema
	 * operacional. Temos as seguintes informa��es com as suas respectivas posi��es:<br>
	 * - 0 -> N�mero de Processadores <br>
	 * - 1 -> Total de Mem�ria livre <br>
	 * - 2 -> Total de Mem�ria do computador <br>
	 * - 3 -> Total de Mem�ria utilizada <br>
	 * - 4 -> Raiz do Sistema <br>
	 * - 5 -> Tamanho do Disco <br>
	 * - 6 -> Espa�o Livre em Disco <br>
	 * - 7 -> Espa�o usado em Disco <br>
	 * - 8 -> Nome do Sistema Operacional <br>
	 * - 9 -> Arquitetura do Sistema Operacional <br>
	 * - 10 -> Vers�o do Sistema Operacional <br>
	 * - 11 -> Separador de Arquivos <br>
	 * - 12 -> Sepadador de Caminho <br>
	 * - 13 -> Linha Separa��o <br>
	 * - 14 -> Nome de Usu�rio <br>
	 * - 15 -> Pasta home do Usu�rio <br>
	 * - 16 -> Pasta corrente do Usu�rio <br>
	 *
	 * @return
	 */
	
	
	
	public List<String> infocomp() {
		List<String> dados = new ArrayList<String>();
		// Total de numero de processadores
		/* Total number of processors or cores available to the JVM */

		dados.add(String.valueOf(Runtime.getRuntime().availableProcessors()));

		/* Total amount of free memory available to the JVM */

		dados.add(String.valueOf(Runtime.getRuntime().freeMemory()));
		
		
		/* This will return Long.MAX_VALUE if there is no preset limit */
	    long maxMemory = Runtime.getRuntime().maxMemory();
	    
		/* This will return Long.MAX_VALUE if there is no preset limit */

		dados.add(String.valueOf(maxMemory));
		
		/* Total memory currently available to the JVM */
		dados.add(String.valueOf(Runtime.getRuntime().totalMemory()));	
		
		
		/* Get a list of all filesystem roots on this system */
	    File[] roots = File.listRoots();

	    /* For each filesystem root, print some info */
	    for (File root : roots) {
	      dados.add(String.valueOf(root.getAbsolutePath()));
	      dados.add(String.valueOf(root.getTotalSpace()));
	      dados.add(String.valueOf(root.getFreeSpace()));
	      dados.add(String.valueOf(root.getUsableSpace()));
	    }
	    
	    
	    dados.add(System.getProperty("os.name"));
	    dados.add(System.getProperty("os.arch"));
	    dados.add(System.getProperty("os.version"));
	    dados.add(System.getProperty("file.separator"));
	    dados.add(System.getProperty("path.separator"));
	    dados.add(System.getProperty("line.separator"));
	    dados.add(System.getProperty("user.name"));
	    dados.add(System.getProperty("user.home"));
	    dados.add(System.getProperty("user.dir"));
	    
	    
	    for(int i = 0 ; i < dados.size(); i++) {
	    	System.out.println(i + " - "+dados.get(i));
	    }
	    
		
		

		return dados;
	}

}